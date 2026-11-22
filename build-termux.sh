#!/data/data/com.termux/files/usr/bin/bash
set -e
ROOT="$(cd "$(dirname "$0")" && pwd)"
cd "$ROOT"
if [ ! -f local.properties ] || ! grep -q '^sdk.dir=' local.properties; then
  SDK="${ANDROID_SDK_ROOT:-${ANDROID_HOME:-}}"
  if [ -z "$SDK" ]; then
    for candidate in "$HOME/android-sdk" "$HOME/Android/Sdk" "$HOME/sdk"; do
      if [ -d "$candidate/platforms" ]; then SDK="$candidate"; break; fi
    done
  fi
  if [ -z "$SDK" ]; then
    echo "Android SDK not found. Set ANDROID_SDK_ROOT or add sdk.dir=/your/sdk/path to local.properties."
    exit 2
  fi
  printf 'sdk.dir=%s\n' "$SDK" > local.properties
fi
if ! command -v gradle >/dev/null 2>&1; then echo "Gradle is not installed in Termux."; exit 3; fi
gradle --no-daemon assembleDebug
APK="$ROOT/app/build/outputs/apk/debug/app-debug.apk"
if [ ! -f "$APK" ]; then echo "Build finished but APK was not found at $APK"; exit 4; fi
OUT="$HOME/storage/downloads/CoreLargePrint-CTP100LG-CorePrint.apk"
mkdir -p "$(dirname "$OUT")"
cp "$APK" "$OUT"
echo "APK created: $OUT"
