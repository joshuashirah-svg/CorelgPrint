package com.Utils;

import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.Utils.PrinterModel;
import com.alibaba.fastjson.asm.Opcodes;
import com.blankj.utilcode.util.GsonUtils;
import com.google.android.gms.common.ConnectionResult;
import com.itextpdf.io.codec.TIFFConstants;
import com.itextpdf.svg.SvgConstants;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PrintModelUtils.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"Lcom/Utils/PrintModelUtils;", "", "()V", "getJLF", "", "Companion", "StringLib_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PrintModelUtils {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static PrinterModel.DataBean xw001 = new PrinterModel.DataBean("XW001", 0, 2, 384, 384, 8, "PR20-", false, 200, 45, 35, 0, false, 2, 2, 0, 0, 0, 0, false, false, false, false, "0", 0, 0);
    private static PrinterModel.DataBean xw002 = new PrinterModel.DataBean("XW002", 0, 2, 576, 576, 12, "PR30-", false, 300, 45, 35, 0, true, 2, 2, 0, 0, 0, 0, false, false, false, false, "0", 0, 0);
    private static PrinterModel.DataBean xw003 = new PrinterModel.DataBean("XW003", 1, 2, 384, 384, 8, "PR25-", false, 200, 45, 25, 0, true, 2, 5, 0, 0, 0, 0, false, false, false, false, "0", 0, 0);
    private static PrinterModel.DataBean jx001 = new PrinterModel.DataBean("JX001", 0, 2, 384, 384, 8, "JX01-", false, 200, 90, 45, 0, true, 2, 3, 0, 0, 0, 0, false, false, false, false, "0", 0, 0);
    private static PrinterModel.DataBean jxm008 = new PrinterModel.DataBean("JXM800", 0, 8, 1600, 1728, 8, "GG-D2100-", true, 200, 26, 25, 183, true, 2, 4, 5, 10, 12, 9, true, true, true, false, "0", 0, 0);
    private static PrinterModel.DataBean m01 = new PrinterModel.DataBean("M01", 1, 2, 384, 384, 8, "M01-", false, 200, 45, 25, 0, true, 2, 5, 0, 0, 0, 0, false, false, false, false, "0", 0, 0);
    private static PrinterModel.DataBean gb01 = new PrinterModel.DataBean("GB01", 0, 2, 384, 384, 8, "GB01-", true, 200, 35, 25, 63, false, 4, 6, 8000, 12000, 17500, 0, false, false, false, false, "0", 0, 0);
    private static PrinterModel.DataBean gb02 = new PrinterModel.DataBean("GB02", 0, 2, 384, 384, 8, "GB02-", true, 200, 26, 25, 83, false, 2, 6, 8600, 12000, 16000, 0, false, false, false, false, "0", 0, 0);
    private static PrinterModel.DataBean gb03 = new PrinterModel.DataBean("GB03", 0, 2, 384, 384, 8, "GB03-", true, 200, 10, 10, 83, true, 2, 6, 9000, 9000, 9000, 8000, true, false, false, true, "1", 45, 1);
    private static PrinterModel.DataBean gb03_n = new PrinterModel.DataBean("GB03", 0, 2, 384, 384, 8, "GB03-", true, 200, 30, 10, 83, true, 2, 6, 7500, 7500, 7500, 8000, true, false, false, true, "1", 45, 1);
    private static PrinterModel.DataBean CMT_0510 = new PrinterModel.DataBean("CMT-0510", 0, 2, 384, 384, 8, "CMT-0510-", true, 200, 30, 10, 83, true, 2, 6, 7500, 7500, 7500, 8000, true, false, false, true, "1", 45, 1);
    private static PrinterModel.DataBean GV_MA211 = new PrinterModel.DataBean("GV-MA211", 0, 2, 384, 384, 8, "GV-MA211-", true, 200, 30, 10, 83, true, 2, 6, 7500, 7500, 7500, 8000, true, false, false, true, "1", 45, 1);
    private static PrinterModel.DataBean sc03 = new PrinterModel.DataBean("SC03", 0, 2, 384, 384, 8, "SC03-", true, 200, 30, 10, 83, true, 2, 6, 7500, 7500, 7500, 8000, true, false, false, true, "1", 45, 1);
    private static PrinterModel.DataBean fl01 = new PrinterModel.DataBean("FL01", 0, 2, 384, 384, 8, "FL01-", true, 200, 20, 10, 183, false, 2, 4, 7500, 7500, 7500, 7500, false, true, false, true, "1", 40, 1, true, 7500, 7500, 7500, 50, 40, 0.9d, 2, false, 2.0f, true, "12C3157CF56B6B9A", true, "", false);
    private static PrinterModel.DataBean KF_5 = new PrinterModel.DataBean("KF-5", 0, 2, 384, 384, 8, "KF-5-", true, 200, 20, 10, 183, false, 2, 4, 7500, 7500, 7500, 7500, false, true, false, true, "1", 40, 1, true, 7500, 7500, 7500, 50, 40, 0.9d, 1, false, 2.0f, true, "12C3157CF56B6B9A", true, "", false);
    private static PrinterModel.DataBean sc04 = new PrinterModel.DataBean("SC04", 0, 2, 384, 384, 8, "SC04-", true, 200, 30, 10, 83, true, 2, 6, 7500, 7500, 7500, 8000, true, false, false, true, "1", 45, 1);
    private static PrinterModel.DataBean gb04 = new PrinterModel.DataBean("GB04", 0, 2, 384, 384, 8, "GB04-", true, 200, 26, 25, 83, false, 4, 6, 8600, 12000, 16000, 0, true, false, false, false, "0", 0, 0);
    private static PrinterModel.DataBean gb05 = new PrinterModel.DataBean("GB05", 0, 2, 384, 384, 8, "GB05-", true, 200, 26, 25, 123, true, 4, 6, 10000, 10000, 10000, 12000, true, false, false, false, "0", 0, 0);
    private static PrinterModel.DataBean gb06 = new PrinterModel.DataBean("GB06", 0, 2, 384, 384, 8, "GB06-", true, 200, 10, 10, 83, true, 2, 6, 9000, 9000, 9000, 8000, true, false, false, true, "1", 45, 1);
    private static PrinterModel.DataBean gb06_n = new PrinterModel.DataBean("GB06", 0, 2, 384, 384, 8, "GB06-", true, 200, 30, 10, 83, true, 2, 6, 7500, 7500, 7500, 8000, true, false, false, true, "1", 45, 1);
    private static PrinterModel.DataBean gt01 = new PrinterModel.DataBean("GT01", 0, 2, 384, 384, 8, "GT01-", true, 200, 30, 25, 123, true, 2, 4, 12000, 12000, 12000, 0, true, false, false, false, "0", 0, 0);
    private static PrinterModel.DataBean gt02 = new PrinterModel.DataBean("GT02", 0, 2, 384, 384, 8, "GT02-", true, 200, 30, 25, 123, true, 2, 4, 9000, 9000, 9000, 8000, true, false, false, true, "1", 45, 1);
    private static PrinterModel.DataBean _58p5 = new PrinterModel.DataBean("58P5", 0, 2, 384, 384, 8, "58P5-", true, 200, 10, 10, 123, true, 2, 6, 6500, 6500, 6500, 0, true, false, false, false, "0", 0, 0);
    private static PrinterModel.DataBean WL01 = new PrinterModel.DataBean("WL01", 0, 2, 384, 384, 8, "WL01-", true, 200, 10, 10, 123, true, 2, 6, 6500, 6500, 6500, 0, true, false, false, false, "0", 0, 0);
    private static PrinterModel.DataBean x5 = new PrinterModel.DataBean("X5", 0, 2, 384, 384, 8, "X5-", true, 200, 10, 10, 123, true, 2, 6, 7500, 7500, 7500, 13000, true, false, false, true, "1", 40, 1);
    private static PrinterModel.DataBean x5_n = new PrinterModel.DataBean("X5", 0, 2, 384, 384, 8, "X5-", true, 200, 30, 10, 123, true, 2, 6, 7500, 7500, 7500, 0, true, false, false, true, "1", 40, 1);
    private static PrinterModel.DataBean x7 = new PrinterModel.DataBean("X7", 0, 2, 384, 384, 8, "X7-", true, 200, 10, 10, 123, true, 2, 6, 7500, 7500, 7500, 0, true, false, false, true, "1", 40, 1);
    private static PrinterModel.DataBean x7_n = new PrinterModel.DataBean("X7", 0, 2, 384, 384, 8, "X7-", true, 200, 30, 10, 123, true, 2, 6, 7500, 7500, 7500, 0, true, false, false, true, "1", 40, 1);
    private static PrinterModel.DataBean s102 = new PrinterModel.DataBean("S102", 0, 2, 384, 384, 8, "S102-", true, 200, 10, 10, 123, true, 2, 6, 6500, 6500, 6500, 0, true, false, false, false, "1", 40, 1);
    private static PrinterModel.DataBean s102_n = new PrinterModel.DataBean("S102", 0, 2, 384, 384, 8, "S102-", true, 200, 30, 10, 123, true, 2, 6, 7500, 7500, 7500, 0, true, false, false, false, "1", 40, 1);
    private static PrinterModel.DataBean ly02 = new PrinterModel.DataBean("LY02", 0, 2, 384, 384, 8, "LY02-", false, 200, 45, 35, 0, true, 2, 2, 0, 0, 0, 0, false, false, false, false, "0", 0, 0);
    private static PrinterModel.DataBean ly05 = new PrinterModel.DataBean("LY05", 0, 3, 576, 576, 8, "LY05-", true, 200, 40, 35, Opcodes.IFEQ, true, 2, 6, 12000, 12000, 12000, 0, true, false, false, false, "0", 0, 0);
    private static PrinterModel.DataBean x1 = new PrinterModel.DataBean("X1", 0, 3, 576, 576, 8, "X1-", true, 200, 40, 35, 183, true, 2, 6, 8500, 8500, 8500, 8500, true, false, false, false, "0", 0, 0);
    private static PrinterModel.DataBean HD1 = new PrinterModel.DataBean("HD1", 0, 3, 576, 576, 8, "HD1-", true, 200, 40, 35, 183, true, 2, 6, 8500, 8500, 8500, 0, true, false, false, false, "0", 0, 0);
    private static PrinterModel.DataBean pr30 = new PrinterModel.DataBean("PR30", 0, 3, 576, 576, 8, "PR30-", true, 200, 18, 18, 183, true, 2, 4, 5, 10, 12, 9, true, false, false, false, "0", 0, 0);
    private static PrinterModel.DataBean pr02 = new PrinterModel.DataBean("PR02", 0, 2, 384, 384, 8, "PR02-", true, 200, 10, 10, 123, true, 2, 6, 5500, 5500, 5500, 11000, true, false, false, true, "0", 80, 2);
    private static PrinterModel.DataBean p10 = new PrinterModel.DataBean("P10", 0, 2, 384, 384, 8, "P10-", true, 200, 10, 10, 123, true, 2, 6, 5500, 5500, 5500, 9500, true, false, false, false, "0", 0, 0);
    private static PrinterModel.DataBean p7 = new PrinterModel.DataBean("P7", 0, 2, 384, 384, 8, "P7-", true, 200, 30, 10, 183, true, 2, 4, 7500, 7500, 7500, 0, true, true, false, true, "1", 40, 1);
    private static PrinterModel.DataBean x6 = new PrinterModel.DataBean("X6", 0, 2, 384, 384, 8, "X6-", true, 200, 10, 10, 123, true, 2, 4, 9000, 9000, 9000, 0, true, false, false, true, "1", 40, 1);
    private static PrinterModel.DataBean x6_n = new PrinterModel.DataBean("X6", 0, 2, 384, 384, 8, "X6-", true, 200, 30, 10, 123, true, 2, 6, 7500, 7500, 7500, 0, true, false, false, true, "1", 40, 1);
    private static PrinterModel.DataBean dy01 = new PrinterModel.DataBean("DY01", 0, 2, 384, 384, 8, "DY01-", true, 200, 30, 10, 123, true, 2, 6, 7500, 7500, 7500, 0, true, false, false, true, "1", 40, 1);
    private static PrinterModel.DataBean IprintIt_Printer = new PrinterModel.DataBean("IprintIt", 0, 2, 384, 384, 8, "IprintIt Printer-", true, 200, 30, 10, 123, true, 2, 6, 7500, 7500, 7500, 0, true, false, false, true, "1", 40, 1);
    private static PrinterModel.DataBean LP6 = new PrinterModel.DataBean("LP6", 0, 2, 384, 384, 8, "LP6-", true, 200, 30, 10, 123, true, 2, 6, 7500, 7500, 7500, 0, true, false, false, true, "1", 40, 1);
    private static PrinterModel.DataBean pr35 = new PrinterModel.DataBean("PR35", 1, 3, 576, 576, 12, "PR35-", true, 200, 18, 18, 183, true, 2, 6, 12000, 12000, 12000, 0, true, false, false, false, "0", 0, 0);
    private static PrinterModel.DataBean s01 = new PrinterModel.DataBean("S01", 1, 2, 384, 384, 8, "S01-", false, 200, 10, 10, 123, true, 2, 6, 6500, 6500, 6500, 0, false, false, false, false, "0", 0, 0);
    private static PrinterModel.DataBean lt01 = new PrinterModel.DataBean("LT01", 0, 2, 384, 384, 8, "LT01-", true, 200, 10, 10, 83, true, 2, 6, 4500, 4500, 4500, 8000, true, false, false, true, "1", 45, 1);
    private static PrinterModel.DataBean gt08 = new PrinterModel.DataBean("GT08", 0, 8, 1600, 1728, 8, "GT08-", true, 200, 30, 22, 512, true, 2, 4, 3000, 3500, 4000, 4500, true, true, false, false, "0", 0, true, 11000, 0, false);
    private static PrinterModel.DataBean GW08 = new PrinterModel.DataBean("GW08", 0, 8, 1600, 1728, 8, "GW08-", true, 200, 30, 22, 512, true, 2, 4, 3000, 3500, 4000, 4500, true, true, false, false, "0", 0, true, 11000, 0, false, "23CCB36FC97F27B7");
    private static PrinterModel.DataBean GW09 = new PrinterModel.DataBean("GW09", 0, 8, 1600, 1728, 8, "GW09-", true, 200, 30, 22, 512, true, 2, 4, 12000, 12000, 12000, 12000, true, true, false, false, "0", 0, true, 12000, 0, false, "23CCB36FC97F27B7");
    private static PrinterModel.DataBean pr88 = new PrinterModel.DataBean("PR88", 0, 8, 1600, 1728, 8, "PR88-", true, 200, 30, 22, 512, true, 2, 4, 3000, 3500, 4000, 4500, true, true, false, false, "0", 0, 0);
    private static PrinterModel.DataBean pr89 = new PrinterModel.DataBean("PR89", 0, 8, 1600, 1728, 8, "PR89-", true, 200, 40, 30, 512, true, 2, 4, 27000, 27000, 27000, 30000, true, true, false, false, "0", 0, 0, 2);
    private static PrinterModel.DataBean pr891 = new PrinterModel.DataBean("PR89", 0, 8, 1600, 1728, 8, "PR89-", true, 200, 40, 30, 512, true, 2, 4, 27000, 27000, 27000, 30000, true, true, false, false, "0", 0, true, 10, 6300, 0, true, 32, 2, "2.0.66");
    private static PrinterModel.DataBean x8l = new PrinterModel.DataBean("X8-L", 0, 8, 1600, 1728, 8, "X8-L-", true, 200, 40, 30, 512, true, 3, 4, 27000, 27000, 27000, 30000, true, true, false, false, "0", 0, false, 0, 0, 0, true, 32, 2, "2.0.66");
    private static PrinterModel.DataBean x8w = new PrinterModel.DataBean("X8-W", 1, 8, 1600, 1728, 8, "X8-W-", true, 200, 40, 30, 512, true, 3, 4, 27000, 27000, 27000, 30000, true, true, false, false, "0", 0, false, 0, 0, 0, true, 32, 2, "2.0.66");
    private static PrinterModel.DataBean ZP801 = new PrinterModel.DataBean("ZP801", 0, 8, 1600, 1728, 8, "ZP801-", true, 200, 40, 30, 512, true, 2, 4, 27000, 27000, 27000, 30000, true, true, false, false, "0", 0, true, 40, 6500, 0, true, 32, 1, "2.0.66");
    private static PrinterModel.DataBean pr893 = new PrinterModel.DataBean("PR893", 0, 8, 2400, 2592, 12, "PR893-", true, 300, 65, 30, 512, true, 2, 4, 8000, 8000, 8000, 30000, true, true, false, false, "0", 0, true, 40, 6300, 0, true, 48, 1, "1");
    private static PrinterModel.DataBean A43 = new PrinterModel.DataBean("A43", 0, 8, 1600, 1728, 8, "A43-", true, 200, 40, 30, 300, true, 2, 4, 17000, 30000, 30000, 30000, true, true, false, false, "0", 0, true, 1, 8000, 0, true, 32, 1, "2.0.67Z");
    private static PrinterModel.DataBean A4300 = new PrinterModel.DataBean("A4300", 0, 8, 2400, 2496, 8, "A4300-", true, 300, 40, 30, 512, true, 2, 2, 10000, 10000, 10000, 30000, true, true, false, false, "0", 0, true, 1, 8000, 0, false, 0, 1, "2.0.67Z");
    private static PrinterModel.DataBean MPA81 = new PrinterModel.DataBean("MPA81", 0, 8, 1600, 1728, 8, "MPA81-", true, 200, 40, 30, 512, true, 2, 2, 17000, 30000, 30000, 30000, true, true, false, false, "0", 0, true, 1, 8000, 0, true, 32, 1, "1");
    private static PrinterModel.DataBean P4 = new PrinterModel.DataBean("P4", 0, 8, 1600, 1728, 8, "P4-", true, 200, 40, 30, 512, true, 2, 4, 17000, 17000, 17000, 30000, true, true, false, false, "0", 0, true, 11000, 0, true, 24, 1);
    private static PrinterModel.DataBean x9 = new PrinterModel.DataBean("X9", 0, 8, 1600, 1728, 8, "X9-", true, 200, 40, 30, 512, true, 3, 4, 15000, 15000, 15000, 33000, true, true, false, false, "0", 0, true, 30, 7300, 0, true, 32, 1, "2.1.1");
    private static PrinterModel.DataBean MV_B530 = new PrinterModel.DataBean("MV-B530", 0, 8, 1600, 1728, 8, "MV-B530-", true, 200, 40, 30, 512, true, 3, 4, 15000, 15000, 15000, 33000, true, true, false, false, "0", 0, false, 30, 7300, 0, true, 32, 1, "0");
    private static PrinterModel.DataBean QDID = new PrinterModel.DataBean("QDID", 0, 8, 1600, 1728, 8, "QDID-", true, 200, 40, 30, 512, true, 3, 4, 15000, 15000, 15000, 33000, true, true, false, false, "0", 0, true, 30, 7300, 0, true, 32, 1, "2.1.1");
    private static PrinterModel.DataBean GL_VS9 = new PrinterModel.DataBean("GL-VS9", 0, 8, 1600, 1728, 8, "GL-VS9-", true, 200, 40, 30, 512, true, 3, 4, 15000, 15000, 15000, 33000, true, true, false, false, "0", 0, true, 30, 7300, 0, true, 32, 1, "2.1.1");
    private static PrinterModel.DataBean ZP802 = new PrinterModel.DataBean("ZP802", 0, 8, 2400, 2496, 12, "ZP802-", true, 300, 20, 1, 512, true, 2, 4, 8000, 8000, 8000, 7000, true, true, false, false, "0", 0, true, 30, 7300, 0, false, 36, 1, "1.0.3");
    private static PrinterModel.DataBean ZPA4Z1 = new PrinterModel.DataBean("ZPA4Z1", 0, 8, 1600, 1728, 8, "ZPA4Z1-", true, 200, 40, 30, 512, true, 2, 4, 27000, 27000, 27000, 30000, true, true, false, false, "0", 0, 0, 2);
    private static PrinterModel.DataBean A42II = new PrinterModel.DataBean("A42II", 0, 8, 1648, 1664, 8, "A42II-", true, 200, 20, 30, 183, false, 2, 4, 10500, 12000, 12500, 12000, true, true, false, false, "0", 0, true, 0, false, true);
    private static PrinterModel.DataBean A41II = new PrinterModel.DataBean("A41II", 0, 8, 1648, 1664, 8, "A41II-", true, 200, 20, 30, 183, false, 2, 4, 10500, 12000, 12500, 12000, true, true, false, false, "0", 0, true, 0, false, true);
    private static PrinterModel.DataBean A41III = new PrinterModel.DataBean("A41III", 0, 8, 1648, 1664, 8, "A41III-", true, 300, 20, 30, 183, false, 2, 4, 10500, 12000, 12500, 12000, true, true, false, false, "0", 0, true, 0, false, true);
    private static PrinterModel.DataBean x8 = new PrinterModel.DataBean("X8", 1, 8, 1600, 1728, 8, "X8-", true, 200, 30, 22, 183, true, 2, 4, 3000, 3500, 4000, 4000, true, true, false, false, "0", 0, 0);
    private static PrinterModel.DataBean s101 = new PrinterModel.DataBean("S101", 0, 2, 384, 384, 8, "S101-", true, 200, 10, 10, 123, true, 2, 6, 6500, 6500, 6500, 0, true, false, false, false, "0", 0, 0);
    private static PrinterModel.DataBean s101_n = new PrinterModel.DataBean("S101", 0, 2, 384, 384, 8, "S101-", true, 200, 30, 10, 123, true, 2, 6, 7500, 7500, 7500, 0, true, false, false, false, "0", 0, 0);
    private static PrinterModel.DataBean pr07 = new PrinterModel.DataBean("PR07", 1, 2, 384, 384, 8, "PR07-", false, 200, 45, 25, 0, true, 2, 5, 0, 0, 0, 0, false, false, false, false, "0", 0, 0);
    private static PrinterModel.DataBean ly01 = new PrinterModel.DataBean("LY01", 0, 2, 384, 384, 8, "LY01-", false, 200, 40, 25, 0, true, 2, 4, 0, 9500, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, 0, false, false, false, false, "0", 0, 0);
    private static PrinterModel.DataBean ly03 = new PrinterModel.DataBean("LY03", 0, 2, 384, 384, 8, "LY03-", true, 200, 10, 10, 83, true, 2, 6, 7500, 7500, 7500, 0, true, false, false, false, "16", 40, 16);
    private static PrinterModel.DataBean gt03 = new PrinterModel.DataBean("GT03", 0, 2, 384, 384, 8, "GT03-", true, 200, 30, 25, 123, true, 2, 4, 12000, 12000, 12000, 0, true, false, false, false, "0", 0, 0);
    private static PrinterModel.DataBean gt04 = new PrinterModel.DataBean("GT04", 0, 2, 384, 384, 8, "GT04-", true, 200, 30, 25, 123, true, 2, 4, 8000, 8000, 8000, 0, true, false, false, false, "0", 0, 0);
    private static PrinterModel.DataBean p5ai = new PrinterModel.DataBean("P5AI", 1, 2, 384, 384, 8, "P5AI-", false, 200, 45, 25, 0, true, 2, 5, 0, 0, 0, 0, false, false, false, false, "0", 0, 0);
    private static PrinterModel.DataBean ly10 = new PrinterModel.DataBean("LY10", 0, 2, 384, 384, 8, "LY10-", true, 200, 26, 25, 183, true, 2, 4, 8, 12, 15, 0, true, true, true, false, "0", 0, 0);
    private static PrinterModel.DataBean ly11 = new PrinterModel.DataBean("LY11", 0, 2, 576, 576, 12, "LY11-", true, 300, 26, 25, 183, true, 3, 4, 0, 3, 15, 0, true, true, true, false, "0", 0, 0);
    private static PrinterModel.DataBean lp100 = new PrinterModel.DataBean("LP100", 0, 2, 384, 384, 8, "LY10-", true, 200, 26, 25, 183, true, 2, 4, 100, 100, 100, 0, true, true, true, false, "0", 0, 0);
    private static PrinterModel.DataBean ai01 = new PrinterModel.DataBean("AI01", 1, 2, 384, 384, 8, "AI01-", false, 200, 45, 25, 0, true, 2, 5, 0, 0, 0, 0, true, false, false, false, "0", 0, 0);
    private static PrinterModel.DataBean m2 = new PrinterModel.DataBean("M2", 0, 2, 384, 384, 8, "M2-", true, 200, 10, 10, 83, true, 2, 4, 4500, 4500, 4500, 8000, true, false, false, true, "1", 45, 1);
    private static PrinterModel.DataBean ZHHC = new PrinterModel.DataBean("ZHHC", 0, 2, 384, 384, 12, "ZHHC-", false, 200, 10, 10, 123, true, 2, 4, 9000, 9000, 9000, 0, true, false, false, false, "1", 40, 1);
    private static PrinterModel.DataBean P6 = new PrinterModel.DataBean("P6", 0, 2, 384, 384, 8, "P6-", true, 200, 10, 10, 180, true, 2, 4, 9500, 9500, 9500, 8000, true, true, false, true, "1", 40, 1, false, 4100, 4100, 4100, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean P7H = new PrinterModel.DataBean("P7H", 0, 2, 384, 384, 8, "P7H-", true, 200, 10, 10, 180, true, 2, 4, 9500, 9500, 9500, 9500, true, true, false, true, "1", 40, 1, false, 6500, 6500, 6500, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean x2H = new PrinterModel.DataBean("X2H", 0, 2, 384, 384, 8, "X2H-", true, 200, 10, 10, 180, true, 2, 4, 9500, 9500, 9500, 9500, true, true, false, true, "1", 40, 1, true, 6500, 6500, 6500, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean x102 = new PrinterModel.DataBean("X102", 0, 2, 384, 384, 8, "X102-", true, 200, 10, 10, 180, true, 2, 4, 9500, 9500, 9500, 9500, true, true, false, true, "1", 40, 1, true, 5800, 5800, 5800, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean x6HP = new PrinterModel.DataBean("X6HP", 0, 2, 384, 384, 8, "X6HP-", true, 200, 10, 10, 180, true, 2, 4, 9500, 9500, 9500, 9500, true, true, false, true, "1", 40, 1, true, 7500, 7500, 7500, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean x5HP = new PrinterModel.DataBean("X5HP", 0, 2, 384, 384, 8, "X5HP-", true, 200, 10, 10, 180, true, 2, 4, 9500, 9500, 9500, 9500, true, true, false, true, "1", 40, 1, true, 7500, 7500, 7500, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean x7HP = new PrinterModel.DataBean("X7HP", 0, 2, 384, 384, 8, "X7HP-", true, 200, 10, 10, 180, true, 2, 4, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, true, true, false, true, "1", 40, 1, true, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean ewtto_ET_Z0504 = new PrinterModel.DataBean("ewtto ET-Z0504", 0, 2, 384, 384, 8, "ewtto ET-Z0504-", true, 200, 10, 10, 180, true, 2, 4, 9500, 9500, 9500, 9500, true, true, false, true, "1", 40, 1, true, 7500, 7500, 7500, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean X103H = new PrinterModel.DataBean("X103H", 0, 2, 384, 384, 8, "X103H-", true, 200, 10, 10, 180, true, 2, 4, 9500, 9500, 9500, 9500, true, true, false, true, "1", 40, 1, true, 7500, 7500, 7500, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean X103h = new PrinterModel.DataBean("X103h", 0, 2, 384, 384, 8, "X103h-", true, 200, 10, 10, 180, true, 2, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, true, 4100, 4100, 4100, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean x6H = new PrinterModel.DataBean("X6H", 0, 2, 384, 384, 8, "X6H-", true, 200, 10, 10, 180, true, 2, 4, 9500, 9500, 9500, 9500, true, true, false, true, "1", 40, 1, false, 5800, 5800, 5800, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean x5H = new PrinterModel.DataBean("X5H", 0, 2, 384, 384, 8, "X5H-", true, 200, 10, 10, 180, true, 2, 4, 9500, 9500, 9500, 9500, true, true, false, true, "1", 40, 1, true, 5800, 5800, 5800, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean an01 = new PrinterModel.DataBean("AN01", 0, 2, 384, 384, 8, "AN01-", true, 200, 10, 10, 103, true, 2, 4, 4000, 5000, 6000, 5000, false, false, false, false, "1", 45, 1, true, 4715, 4715, 4715, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean s5 = new PrinterModel.DataBean("XiaoWa", 0, 2, 384, 384, 8, "XiaoWa-", true, 200, 20, 10, 183, false, 2, 4, 12000, 12000, 12000, 13000, true, false, false, false, "1", 40, 1, true, 7300, 7300, 7300, 50, 40, 0.9d, 1, "269C83C1E32421E7");
    private static PrinterModel.DataBean CP01 = new PrinterModel.DataBean("CP01", 0, 2, 384, 384, 8, "CP01-", true, 200, 20, 10, 183, false, 2, 4, 12000, 12000, 12000, 13000, true, false, false, false, "1", 40, 1, true, 7300, 7300, 7300, 50, 40, 0.9d, 1, 1, "269C83C1E32421E7");
    private static PrinterModel.DataBean S5A = new PrinterModel.DataBean("S5A", 1, 2, 384, 384, 8, "S5A-", true, 200, 20, 10, 183, false, 2, 4, 12000, 12000, 12000, 13000, true, false, false, false, "1", 40, 1, true, 7300, 7300, 7300, 50, 40, 0.9d, 1, 1);
    private static PrinterModel.DataBean P20max = new PrinterModel.DataBean("P20 max", 1, 2, 384, 384, 8, "P20 max-", true, 200, 20, 10, 183, false, 2, 4, 12000, 12000, 12000, 13000, true, false, false, false, "1", 40, 1, true, 7300, 7300, 7300, 50, 40, 0.9d, 1, 1);
    private static PrinterModel.DataBean S9A = new PrinterModel.DataBean("S9A", 0, 2, 384, 384, 8, "S9A-", true, 200, 20, 10, 183, false, 2, 4, 12000, 12000, 12000, 13000, true, false, false, false, "1", 40, 1, true, 7300, 7300, 7300, 50, 40, 0.9d, 1, 1);
    private static PrinterModel.DataBean DY33A = new PrinterModel.DataBean("DY33A", 0, 2, 384, 384, 8, "DY33A-", true, 200, 20, 10, 183, false, 2, 4, 12000, 12000, 12000, 13000, true, false, false, false, "1", 40, 1, true, 7300, 7300, 7300, 50, 40, 0.9d, 1, 1);
    private static PrinterModel.DataBean YMS_BT01 = new PrinterModel.DataBean("YMS-BT01", 0, 2, 384, 384, 8, "YMS-BT01-", true, 200, 20, 10, 183, false, 2, 4, 5000, 5000, 5000, 5000, true, false, false, false, "1", 40, 1, true, 5000, 5000, 5000, 50, 40, 0.9d, 1, "1F4AE23A9F42CAF4");
    private static PrinterModel.DataBean WJ_HOT_PRT = new PrinterModel.DataBean("WJ-HOT-PRT", 0, 2, 384, 384, 8, "WJ-HOT-PRT-", true, 200, 20, 10, 183, false, 2, 4, 12000, 12000, 12000, 13000, true, false, false, false, "1", 40, 1, true, 7300, 7300, 7300, 50, 40, 0.9d, 1, "1D32CAEF91B5A92D");
    private static PrinterModel.DataBean SeznikNeo = new PrinterModel.DataBean("SeznikNeo", 0, 2, 384, 384, 8, "SeznikNeo-", true, 200, 20, 10, 183, false, 2, 4, 12000, 12000, 12000, 13000, true, false, false, false, "1", 40, 1, true, 7300, 7300, 7300, 50, 40, 0.9d, 1, "269C83C1E32421E7");
    private static PrinterModel.DataBean JRX01 = new PrinterModel.DataBean("JRX01", 0, 2, 384, 384, 8, "JRX01-", true, 200, 20, 10, 183, false, 2, 4, 12000, 12000, 12000, 13000, true, false, false, false, "1", 40, 1, true, 7300, 7300, 7300, 50, 40, 0.9d, 1, "269C83C1E32421E7", true);
    private static PrinterModel.DataBean RS9000 = new PrinterModel.DataBean("RS9000", 0, 2, 384, 384, 8, "RS9000-", true, 200, 20, 10, 183, false, 2, 4, 12000, 12000, 12000, 13000, true, false, false, false, "1", 40, 1, true, 7300, 7300, 7300, 50, 40, 0.9d, 1, "1F2ABBFF7D9ED74F", true);
    private static PrinterModel.DataBean DY49 = new PrinterModel.DataBean("DY49", 0, 2, 384, 384, 8, "DY49-", true, 200, 20, 10, 183, false, 2, 4, 12000, 12000, 12000, 13000, true, false, false, false, "1", 40, 1, true, 7300, 7300, 7300, 50, 40, 0.9d, 1, "269C83C1E32421E7", true);
    private static PrinterModel.DataBean QDX01 = new PrinterModel.DataBean("QDX01", 0, 2, 384, 384, 8, "QDX01-", true, 200, 20, 10, 183, false, 2, 4, 12000, 12000, 12000, 13000, true, false, false, false, "1", 40, 1, true, 7300, 7300, 7300, 50, 40, 0.9d, 1, "269C83C1E32421E7");
    private static PrinterModel.DataBean wts07 = new PrinterModel.DataBean("wts07", 0, 2, 384, 384, 8, "wts07-", true, 200, 20, 10, 183, false, 2, 4, 12000, 12000, 12000, 13000, true, false, false, false, "1", 40, 1, true, 7000, 7000, 7000, 50, 40, 0.9d, 1, "269C83C1E32421E7", true);
    private static PrinterModel.DataBean GT10 = new PrinterModel.DataBean("GT10", 0, 8, 1600, 1728, 8, "GT10-", true, 200, 30, 22, 383, false, 2, 4, 3000, 3500, 4000, 4500, true, true, false, false, "0", 40, 1, false, 7000, 7000, 7000, 50, 40, 0.9d, 1, "23CCB36FC97F27B7", true, "1");
    private static PrinterModel.DataBean GT09 = new PrinterModel.DataBean("GT09", 0, 8, 1600, 1728, 8, "GT09-", true, 200, 30, 22, 383, false, 2, 4, 3000, 3500, 4000, 4500, true, true, false, false, "0", 40, 1, false, 7000, 7000, 7000, 50, 40, 0.9d, 1, "23CCB36FC97F27B7", true);
    private static PrinterModel.DataBean A200 = new PrinterModel.DataBean("A200", 0, 8, 1648, 1664, 8, "A200-", true, 200, 20, 30, 183, false, 2, 4, 10500, 12000, 12500, 12000, true, true, false, false, "0", 0, true, 0, false, true);
    private static PrinterModel.DataBean x7H = new PrinterModel.DataBean("X7H", 0, 2, 384, 384, 8, "X7H-", true, 200, 10, 10, 180, true, 2, 4, 9500, 9500, 9500, 9500, true, true, false, true, "1", 40, 1, true, 5800, 5800, 5800, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean x2h = new PrinterModel.DataBean("X2h", 0, 2, 384, 384, 8, "X2h-", true, 200, 10, 10, 180, true, 2, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, true, 4100, 4100, 4100, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean x5h = new PrinterModel.DataBean("X5h", 0, 2, 384, 384, 8, "X5h-", true, 200, 10, 10, 180, true, 2, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, true, 4715, 4715, 4715, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean MTPR26BK = new PrinterModel.DataBean("MTPR26BK", 0, 2, 384, 384, 8, "MTPR26BK-", true, 200, 10, 10, 180, true, 2, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, true, 4715, 4715, 4715, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean ML_MP_01 = new PrinterModel.DataBean("ML-MP-01", 0, 2, 384, 384, 8, "ML-MP-01-", true, 200, 10, 10, 180, true, 2, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, true, 4715, 4715, 4715, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean Luxorp_PX10 = new PrinterModel.DataBean("Luxorp.PX10", 0, 2, 384, 384, 8, "Luxorp.PX10-", true, 200, 10, 10, 180, true, 2, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, true, 4715, 4715, 4715, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean DTR_R0 = new PrinterModel.DataBean("DTR-R0", 0, 2, 384, 384, 8, "DTR-R0-", true, 200, 10, 10, 180, true, 2, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, true, 4715, 4715, 4715, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean ROSSMANN = new PrinterModel.DataBean("ROSSMANN", 0, 2, 384, 384, 8, "ROSSMANN-", true, 200, 10, 10, 180, true, 2, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, true, 4100, 4100, 4100, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean X18 = new PrinterModel.DataBean("X18", 0, 2, 384, 384, 8, "X18-", true, 200, 10, 10, 180, true, 2, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, true, 4715, 4715, 4715, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean CLICK_SOUND = new PrinterModel.DataBean("CLICK-SOUND", 0, 2, 384, 384, 8, "CLICK-SOUND-", true, 200, 10, 10, 180, true, 2, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, true, 4715, 4715, 4715, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean CLICK_PRINT = new PrinterModel.DataBean("CLICK-PRINT", 0, 2, 384, 384, 8, "CLICK-PRINT-", true, 200, 10, 10, 180, true, 2, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, true, 4715, 4715, 4715, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean DT1_R = new PrinterModel.DataBean("DT1-R", 0, 2, 384, 384, 8, "DT1-R-", true, 200, 10, 10, 180, true, 2, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, true, 4715, 4715, 4715, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean MVMT_INK = new PrinterModel.DataBean("MVMT INK", 0, 2, 384, 384, 8, "MVMT INK-", true, 200, 10, 10, 180, true, 2, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, true, 4715, 4715, 4715, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean _0019B_D = new PrinterModel.DataBean("0019B-D", 0, 2, 384, 384, 8, "0019B-D-", true, 200, 10, 10, 180, true, 2, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, true, 4715, 4715, 4715, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean EMX_040256 = new PrinterModel.DataBean("EMX-040256", 0, 2, 384, 384, 8, "EMX-040256-", true, 200, 10, 10, 180, true, 2, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, true, 4715, 4715, 4715, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean HT0125 = new PrinterModel.DataBean("HT0125", 0, 2, 384, 384, 8, "HT0125-", true, 200, 10, 10, 180, true, 2, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, true, 4100, 4100, 4100, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean DT1_0 = new PrinterModel.DataBean("DT1-0", 0, 2, 384, 384, 8, "DT1-0-", true, 200, 10, 10, 180, true, 2, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, true, 4100, 4100, 4100, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean x7h = new PrinterModel.DataBean("X7h", 0, 2, 384, 384, 8, "X7h-", true, 200, 10, 10, 180, true, 2, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, true, 4100, 4100, 4100, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean _0019B_C = new PrinterModel.DataBean("0019B-C", 0, 2, 384, 384, 8, "0019B-C-", true, 200, 10, 10, 180, true, 2, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, true, 4100, 4100, 4100, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean x100 = new PrinterModel.DataBean("X100", 0, 2, 384, 384, 8, "X100-", true, 200, 10, 10, 180, true, 2, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, true, 4100, 4100, 4100, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean x101H = new PrinterModel.DataBean(" X101H", 0, 2, 384, 384, 8, " X101H-", true, 200, 10, 10, 180, true, 2, 10, 9500, 9500, 9500, 9500, true, true, false, true, "1", 40, 1, true, 5800, 5800, 5800, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean LGM01 = new PrinterModel.DataBean("LGM01", 0, 2, 384, 384, 8, "LGM01-", true, 200, 10, 10, 180, true, 2, 4, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, true, true, false, true, "1", 40, 1, true, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean p1 = new PrinterModel.DataBean("P1", 0, 2, 384, 384, 8, "P1-", true, 200, 10, 10, 180, true, 2, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, true, 4100, 4100, 4100, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean DY03 = new PrinterModel.DataBean("DY03", 0, 2, 384, 384, 8, "DY03-", true, 200, 10, 10, 180, true, 2, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, true, 4100, 4100, 4100, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean sc03h = new PrinterModel.DataBean("SC03h", 0, 2, 384, 384, 8, "SC03h-", true, 200, 10, 10, 180, true, 2, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, true, 4100, 4100, 4100, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean TD11308 = new PrinterModel.DataBean("TD-11308", 0, 2, 384, 384, 8, "TD-11308-", true, 200, 10, 10, 180, true, 2, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, true, 4100, 4100, 4100, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean P5 = new PrinterModel.DataBean("P5", 0, 2, 576, 576, 12, "P5-", true, 300, 10, 10, TIFFConstants.TIFFTAG_MINSAMPLEVALUE, true, 2, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, true, 4100, 4100, 4100, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean XC9 = new PrinterModel.DataBean("XC9", 0, 2, 384, 384, 8, "XC9-", true, 200, 10, 10, 180, true, 2, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, true, 4100, 4100, 4100, 50, 40, 0.9d, 2);
    private static PrinterModel.DataBean XC9_FL01 = new PrinterModel.DataBean("XC9-FL01", 0, 2, 384, 384, 8, "XC9-FL01-", true, 200, 10, 10, 180, true, 2, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, true, 4100, 4100, 4100, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean PT001 = new PrinterModel.DataBean("PT001", 0, 2, 384, 384, 8, "PT001-", true, 200, 10, 10, 180, true, 2, 4, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, 8000, true, true, false, true, "1", 32, 1, true, 4100, 4100, 4100, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean sc04h = new PrinterModel.DataBean("SC04h", 0, 2, 384, 384, 8, "SC04h-", true, 200, 10, 10, 180, true, 2, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, true, 4100, 4100, 4100, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean P2 = new PrinterModel.DataBean("P2", 0, 2, 384, 384, 8, "P2-", true, 200, 10, 10, 180, true, 3, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, true, 4100, 4100, 4100, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean sc05 = new PrinterModel.DataBean("SC05", 0, 2, 384, 384, 8, "SC05-", true, 200, 10, 10, 180, true, 2, 4, 9500, 9500, 9500, 9500, true, true, false, true, "1", 40, 1, true, 7500, 7500, 7500, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean IM_04 = new PrinterModel.DataBean("IM.04", 0, 2, 384, 384, 8, "IM.04-", true, 200, 10, 10, 180, true, 2, 4, 9500, 9500, 9500, 9500, true, true, false, true, "1", 40, 1, true, 7500, 7500, 7500, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean rt034h = new PrinterModel.DataBean("RT034h", 0, 2, 384, 384, 8, "RT034h-", true, 200, 10, 10, 180, true, 2, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, true, 4100, 4100, 4100, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean D1 = new PrinterModel.DataBean("D1", 0, 2, 384, 384, 8, "D1-", true, 200, 10, 10, 180, true, 2, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, true, 4100, 4100, 4100, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean UXPORTMIP = new PrinterModel.DataBean("UXPORTMIP", 0, 2, 384, 384, 8, "UXPORTMIP-", true, 200, 10, 10, 180, true, 2, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, true, 4100, 4100, 4100, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean GB03SL = new PrinterModel.DataBean("GB03SL", 0, 2, 384, 384, 8, "GB03SL-", true, 200, 10, 10, 180, true, 2, 10, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, true, 4100, 4100, 4100, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean GB03SH = new PrinterModel.DataBean("GB03SH", 0, 2, 384, 384, 8, "GB03SH-", true, 200, 25, 25, 180, true, 2, 4, 9500, 9500, 9500, 9500, true, true, false, true, "1", 40, 1, true, 7500, 7500, 7500, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean FC02 = new PrinterModel.DataBean("FC02", 0, 2, 384, 384, 8, "FC02-", true, 200, 25, 25, 180, true, 2, 4, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, true, true, false, true, "1", 40, 1, true, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean A33 = new PrinterModel.DataBean("A33", 0, 2, 384, 384, 8, "A33-", true, 200, 25, 25, 183, true, 2, 4, 9500, 9500, 9500, 9500, true, true, false, true, "1", 40, 1, true, 7500, 7500, 7500, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean SC03H = new PrinterModel.DataBean("SC03H", 0, 2, 384, 384, 8, "SC03H-", true, 200, 25, 25, 180, true, 2, 4, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, true, true, false, true, "1", 40, 1, true, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean GB03PL = new PrinterModel.DataBean("GB03PL", 0, 2, 384, 384, 8, "GB03PL-", true, 200, 10, 10, 180, true, 2, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, true, 4100, 4100, 4100, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean GB03PH = new PrinterModel.DataBean("GB03PH", 0, 2, 384, 384, 8, "GB03PH-", true, 200, 25, 25, 180, true, 2, 4, 9500, 9500, 9500, 9500, true, true, false, true, "1", 40, 1, true, 7500, 7500, 7500, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean GB02SH = new PrinterModel.DataBean("GB02SH", 0, 2, 384, 384, 8, "GB02SH-", true, 200, 25, 25, 180, true, 2, 4, 7000, 7000, 7000, 9500, true, true, false, true, "1", 40, 1, true, 3000, 3000, 3000, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean Pocket_Printer = new PrinterModel.DataBean("Pocket Printer", 0, 2, 384, 384, 8, "Pocket Printer-", true, 200, 10, 10, 180, true, 2, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, true, 4100, 4100, 4100, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean TCM690464 = new PrinterModel.DataBean("TCM690464", 0, 2, 384, 384, 8, "TCM690464-", true, 200, 10, 10, 180, true, 2, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, true, 4100, 4100, 4100, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean _15P3 = new PrinterModel.DataBean("15P3", 0, 1, 90, 96, 8, "15P3-", true, 200, 10, 10, 180, true, 2, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, 1, false, true, 0.5f, true, 0);
    private static PrinterModel.DataBean YK_06 = new PrinterModel.DataBean("YK06", 0, 1, 90, 96, 8, "YK06-", true, 200, 10, 10, 180, true, 2, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, 1, false, true, 0.5f, true, 10);
    private static PrinterModel.DataBean WQ02 = new PrinterModel.DataBean("WQ02", 0, 1, 90, 96, 8, "WQ02-", true, 200, 10, 10, 180, false, 2, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, 2, false, true, 0.5f, true, 0);
    private static PrinterModel.DataBean L1 = new PrinterModel.DataBean("L1", 0, 1, 90, 96, 8, "L1-", true, 200, 8, 8, 180, true, 2, 4, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, true, true, false, true, "1", 40, 1, 1, false, true, 0.5f, true, 0);
    private static PrinterModel.DataBean U2 = new PrinterModel.DataBean("U2", 0, 1, 90, 96, 8, "U2-", true, 200, 8, 8, 180, true, 2, 4, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, true, true, false, true, "1", 40, 1, 1, false, true, 0.5f, true, -12);
    private static PrinterModel.DataBean X16 = new PrinterModel.DataBean("X16", 1, 2, 384, 384, 8, "X16-", true, 200, 10, 10, 180, true, 3, 4, 5000, 5000, 5000, 8000, true, true, false, false, "1", 40, 1, true, 4715, 4715, 4715, 50, 40, 0.9d, 1, false, 2.0f, true);
    private static PrinterModel.DataBean AudioPrint = new PrinterModel.DataBean("Audio Print", 1, 2, 384, 384, 8, "Audio Print-", true, 200, 10, 10, 180, true, 3, 4, 5000, 5000, 5000, 8000, true, true, false, false, "1", 40, 1, true, 4715, 4715, 4715, 50, 40, 0.9d, 1, false, 2.0f, true);
    private static PrinterModel.DataBean TRAiPrinter = new PrinterModel.DataBean("TRAiPrinter", 1, 2, 384, 384, 8, "TRAiPrinter-", true, 200, 10, 10, 180, true, 3, 4, 5000, 5000, 5000, 8000, true, true, false, false, "1", 40, 1, true, 4715, 4715, 4715, 50, 40, 0.9d, 1, false, 2.0f, true);
    private static PrinterModel.DataBean Totori = new PrinterModel.DataBean("Totori", 1, 2, 384, 384, 8, "Totori-", true, 200, 10, 10, 180, true, 3, 4, 5000, 5000, 5000, 8000, true, true, false, false, "1", 40, 1, true, 4715, 4715, 4715, 50, 40, 0.9d, 1, false, 2.0f, true);
    private static PrinterModel.DataBean VOICE_PRINT = new PrinterModel.DataBean("VOICE PRINT", 1, 2, 384, 384, 8, "VOICE PRINT-", true, 200, 10, 10, 180, true, 3, 4, 5000, 5000, 5000, 8000, true, true, false, false, "1", 40, 1, true, 4715, 4715, 4715, 50, 40, 0.9d, 1, false, 2.0f, true);
    private static PrinterModel.DataBean KIDYPRINTER = new PrinterModel.DataBean("KIDYPRINTER", 1, 2, 384, 384, 8, "KIDYPRINTER-", true, 200, 10, 10, 180, true, 3, 4, 5000, 5000, 5000, 8000, true, true, false, false, "1", 40, 1, true, 4715, 4715, 4715, 50, 40, 0.9d, 1, false, 2.0f, true);
    private static PrinterModel.DataBean LISCIANI = new PrinterModel.DataBean("LISCIANI", 1, 2, 384, 384, 8, "LISCIANI-", true, 200, 10, 10, 180, true, 3, 4, 5000, 5000, 5000, 8000, true, true, false, false, "1", 40, 1, true, 4715, 4715, 4715, 50, 40, 0.9d, 1, false, 2.0f, true);
    private static PrinterModel.DataBean AiPrint = new PrinterModel.DataBean("AiPrint", 1, 2, 384, 384, 8, "AiPrint-", true, 200, 10, 10, 180, true, 3, 4, 5000, 5000, 5000, 8000, true, true, false, false, "1", 40, 1, true, 3300, 3300, 3300, 50, 40, 0.9d, 1, false, 2.0f, true);
    private static PrinterModel.DataBean AiPrintT1 = new PrinterModel.DataBean("AiPrintT1", 1, 2, 384, 384, 8, "AiPrintT1-", true, 200, 10, 10, 180, true, 3, 4, 10000, 10000, 10000, 8000, true, true, false, false, "1", 40, 1, true, 4715, 4715, 4715, 50, 40, 0.9d, 1, false, 2.0f, true, -16);
    private static PrinterModel.DataBean A2 = new PrinterModel.DataBean("A2", 1, 2, 384, 384, 8, "A2-", true, 200, 10, 10, 180, true, 3, 4, 5000, 5000, 5000, 8000, true, true, false, false, "1", 40, 1, true, 4715, 4715, 4715, 50, 40, 0.9d, 1, false, 2.0f, true);
    private static PrinterModel.DataBean A3 = new PrinterModel.DataBean("A3", 1, 2, 384, 384, 8, "A3-", true, 200, 10, 10, 180, true, 3, 4, 5000, 5000, 5000, 8000, true, true, false, false, "1", 40, 1, true, 4715, 4715, 4715, 50, 40, 0.9d, 1, false, 2.0f, true);
    private static PrinterModel.DataBean x6h = new PrinterModel.DataBean("X6h", 0, 2, 384, 384, 8, "X6h-", true, 200, 10, 10, 180, true, 2, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, true, 4715, 4715, 4715, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean U1 = new PrinterModel.DataBean("U1", 0, 2, 384, 384, 8, "U1-", true, 200, 10, 10, 180, true, 2, 4, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, 8000, true, true, false, true, "1", 40, 1, true, 4715, 4715, 4715, 50, 40, 0.9d, 1, true, 2.0f, true, 0, 24);
    private static PrinterModel.DataBean EA_LBLU1_WH = new PrinterModel.DataBean("EA-LBLU1-WH", 0, 2, 384, 384, 8, "EA-LBLU1-WH-", true, 200, 10, 10, 180, true, 2, 4, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, 8000, true, true, false, true, "1", 40, 1, true, 4715, 4715, 4715, 50, 40, 0.9d, 1, true, 2.0f, true, 0, 24);
    private static PrinterModel.DataBean D100 = new PrinterModel.DataBean("D100", 0, 4, 864, 864, 8, "D100-", true, 200, 10, 10, 180, true, 2, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, true, 4715, 4715, 4715, 50, 40, 0.9d, 1, true, 4.0f, true, "1D126D725C933CA5");
    private static PrinterModel.DataBean MiniPrinter = new PrinterModel.DataBean("Mini Printer", 0, 2, 384, 384, 8, "CTP500", true, 200, 20, 20, 180, true, 2, 4, 14000, 14000, 14000, 14000, true, true, false, true, "1", 40, 1, true, 4715, 4715, 4715, 50, 25, 0.9d, 1);
    private static PrinterModel.DataBean Label_Printer = new PrinterModel.DataBean("Label Printer", 0, 1, 90, 96, 8, "CPLM10", true, 200, 10, 10, 180, false, 2, 4, 1400, 1400, 1400, 1400, true, true, false, true, "1", 40, 1, 1, false, true, 0.5f, true);
    private static PrinterModel.DataBean Shipping_Printer = new PrinterModel.DataBean("Shipping Printer", 0, 4, 864, 800, 8, "CTP800BD", true, 200, 10, 10, 180, true, 2, 4, 8000, 8000, 8000, 8000, false, true, false, true, "1", 40, 1, true, 4715, 4715, 4715, 50, 40, 0.9d, 0, true, 4.0f, true, "1D126D725C933CA5", false, "1", true);
    private static PrinterModel.DataBean Shipping_Printer2 = new PrinterModel.DataBean("Shipping Printer", 0, 4, 864, 800, 8, "CTP750BY", true, 200, 10, 10, 180, true, 2, 4, 8000, 8000, 8000, 8000, false, true, false, true, "1", 40, 1, true, 4715, 4715, 4715, 50, 40, 0.9d, 0, true, 4.0f, true, "1D126D725C933CA5", false, "1", true);
    private static PrinterModel.DataBean Professional_Printer = new PrinterModel.DataBean("Professional Printer", 0, 8, 1600, 1728, 8, "CTP100LG", true, 200, 20, 15, 512, true, 5, 4, 12000, 12000, 12000, 33000, true, true, false, false, "0", 0, true, 30, 7300, 0, true, 32, 1, "1");
    private static PrinterModel.DataBean PR08 = new PrinterModel.DataBean("PR08", 0, 8, 1600, 1728, 8, "PR08-", true, 200, 20, 15, 512, true, 5, 4, 12000, 12000, 12000, 33000, true, true, false, false, "0", 0, true, 30, 7300, 0, true, 32, 1, "1");
    private static PrinterModel.DataBean S600 = new PrinterModel.DataBean("S600", 0, 4, 864, 800, 8, "S600-", true, 200, 10, 10, 180, true, 2, 4, 8000, 8000, 8000, 8000, false, true, false, true, "1", 40, 1, true, 4715, 4715, 4715, 50, 40, 0.9d, 0, true, 4.0f, true, "1D126D725C933CA5", false, "1", true);
    private static PrinterModel.DataBean KS_1 = new PrinterModel.DataBean("KS-1", 0, 4, 864, 800, 8, "KS-1-", true, 200, 10, 10, 180, true, 2, 4, 8000, 8000, 8000, 8000, false, true, false, true, "1", 40, 1, true, 4715, 4715, 4715, 50, 40, 0.9d, 0, true, 4.0f, true, "1D126D725C933CA5", false, "1", true);
    private static PrinterModel.DataBean DL_X7 = new PrinterModel.DataBean("DL_X7", 0, 4, 864, 864, 8, "DL_X7-", true, 200, 10, 10, 512, true, 2, 4, 7000, 7000, 7000, 8000, true, true, false, true, "1", 40, 1, true, 4715, 4715, 4715, 50, 40, 0.9d, 2, true, 4.0f, true, "163B5376F6CC33CA");
    private static PrinterModel.DataBean DL_X7Pro = new PrinterModel.DataBean("DL_X7Pro", 0, 4, 1280, 1280, 8, "DL_X7Pro-", true, 300, 10, 10, 512, true, 2, 4, 7000, 7000, 7000, 8000, true, true, false, true, "1", 40, 1, true, 4715, 4715, 4715, 50, 40, 0.9d, 2, true, 4.0f, true, "163B5376F6CC33CA");
    private static PrinterModel.DataBean DL_X2 = new PrinterModel.DataBean("DL_X2", 0, 2, 384, 384, 8, "DL_X2-", true, 200, 10, 10, 180, true, 2, 4, 8000, 8000, 8000, 8000, true, true, false, true, "1", 40, 1, true, 4100, 4100, 4100, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean DL_GE225 = new PrinterModel.DataBean("DL_GE225", 0, 2, 384, 384, 8, "DL_GE225-", true, 200, 10, 10, 180, true, 2, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, true, 4100, 4100, 4100, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean DL_X2Pro = new PrinterModel.DataBean("DL_X2Pro", 0, 2, 576, 576, 12, "DL_X2Pro-", true, 300, 10, 10, TIFFConstants.TIFFTAG_MINSAMPLEVALUE, true, 2, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, true, 4100, 4100, 4100, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean SeznikEcho = new PrinterModel.DataBean("SeznikEcho", 0, 2, 384, 384, 8, "SeznikEcho-", true, 200, 10, 10, 180, true, 2, 4, 5000, 5000, 5000, 8000, true, true, false, true, "1", 40, 1, true, 4100, 4100, 4100, 50, 40, 0.9d, 1);
    private static PrinterModel.DataBean CameraPrint = new PrinterModel.DataBean("CameraPrint", 1, 2, 384, 384, 8, "CameraPrint-", true, 200, 10, 10, 180, true, 3, 4, 5000, 5000, 5000, 8000, true, true, false, false, "1", 40, 1, true, 2800, 2800, 2800, 50, 40, 0.9d, 1, false, 2.0f, true);

    /* JADX INFO: compiled from: PrintModelUtils.kt */
    @Metadata(d1 = {"\u0000)\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0003\bÎ\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010Ò\u0004\u001a\u00030Ó\u0004J\b\u0010Ô\u0004\u001a\u00030Ó\u0004J\u0012\u0010Õ\u0004\u001a\u00030Ó\u00042\b\u0010Ö\u0004\u001a\u00030Ó\u0004J\b\u0010×\u0004\u001a\u00030Ó\u0004J\u0019\u0010Ø\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u00040Ù\u0004j\t\u0012\u0004\u0012\u00020\u0004`Ú\u0004J\b\u0010Û\u0004\u001a\u00030Ó\u0004J\u0019\u0010Ü\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u00040Ù\u0004j\t\u0012\u0004\u0012\u00020\u0004`Ú\u0004J\b\u0010Ý\u0004\u001a\u00030Ó\u0004J\u0019\u0010Þ\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u00040Ù\u0004j\t\u0012\u0004\u0012\u00020\u0004`Ú\u0004J\b\u0010ß\u0004\u001a\u00030Ó\u0004J\u0019\u0010à\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u00040Ù\u0004j\t\u0012\u0004\u0012\u00020\u0004`Ú\u0004J\b\u0010á\u0004\u001a\u00030Ó\u0004J\b\u0010â\u0004\u001a\u00030Ó\u0004J\b\u0010ã\u0004\u001a\u00030Ó\u0004J\b\u0010ä\u0004\u001a\u00030Ó\u0004J\b\u0010å\u0004\u001a\u00030Ó\u0004J\b\u0010æ\u0004\u001a\u00030Ó\u0004J\u0019\u0010ç\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u00040Ù\u0004j\t\u0012\u0004\u0012\u00020\u0004`Ú\u0004J\b\u0010è\u0004\u001a\u00030Ó\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001a\u0010'\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001a\u0010*\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001a\u0010-\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001a\u00100\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001a\u00103\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001a\u00106\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR\u001a\u00109\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR\u001a\u0010<\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR\u001a\u0010?\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0006\"\u0004\bA\u0010\bR\u001a\u0010B\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010\bR\u001a\u0010E\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0006\"\u0004\bG\u0010\bR\u001a\u0010H\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0006\"\u0004\bJ\u0010\bR\u001a\u0010K\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0006\"\u0004\bM\u0010\bR\u001a\u0010N\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0006\"\u0004\bP\u0010\bR\u001a\u0010Q\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u0006\"\u0004\bS\u0010\bR\u001a\u0010T\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0006\"\u0004\bV\u0010\bR\u001a\u0010W\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\u0006\"\u0004\bY\u0010\bR\u001a\u0010Z\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\u0006\"\u0004\b\\\u0010\bR\u001a\u0010]\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u0006\"\u0004\b_\u0010\bR\u001a\u0010`\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010\u0006\"\u0004\bb\u0010\bR\u001a\u0010c\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010\u0006\"\u0004\be\u0010\bR\u001a\u0010f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010\u0006\"\u0004\bh\u0010\bR\u001a\u0010i\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\u0006\"\u0004\bk\u0010\bR\u001a\u0010l\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010\u0006\"\u0004\bn\u0010\bR\u001a\u0010o\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010\u0006\"\u0004\bq\u0010\bR\u001a\u0010r\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010\u0006\"\u0004\bt\u0010\bR\u001a\u0010u\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010\u0006\"\u0004\bw\u0010\bR\u001a\u0010x\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010\u0006\"\u0004\bz\u0010\bR\u001a\u0010{\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b|\u0010\u0006\"\u0004\b}\u0010\bR\u001b\u0010~\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u0010\u0006\"\u0005\b\u0080\u0001\u0010\bR\u001d\u0010\u0081\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u0010\u0006\"\u0005\b\u0083\u0001\u0010\bR\u001d\u0010\u0084\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0001\u0010\u0006\"\u0005\b\u0086\u0001\u0010\bR\u001d\u0010\u0087\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0088\u0001\u0010\u0006\"\u0005\b\u0089\u0001\u0010\bR\u001d\u0010\u008a\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u0010\u0006\"\u0005\b\u008c\u0001\u0010\bR\u001d\u0010\u008d\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008e\u0001\u0010\u0006\"\u0005\b\u008f\u0001\u0010\bR\u001d\u0010\u0090\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0091\u0001\u0010\u0006\"\u0005\b\u0092\u0001\u0010\bR\u001d\u0010\u0093\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0094\u0001\u0010\u0006\"\u0005\b\u0095\u0001\u0010\bR\u001d\u0010\u0096\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0097\u0001\u0010\u0006\"\u0005\b\u0098\u0001\u0010\bR\u001d\u0010\u0099\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009a\u0001\u0010\u0006\"\u0005\b\u009b\u0001\u0010\bR\u001d\u0010\u009c\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009d\u0001\u0010\u0006\"\u0005\b\u009e\u0001\u0010\bR\u001d\u0010\u009f\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b \u0001\u0010\u0006\"\u0005\b¡\u0001\u0010\bR\u001d\u0010¢\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b£\u0001\u0010\u0006\"\u0005\b¤\u0001\u0010\bR\u001d\u0010¥\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¦\u0001\u0010\u0006\"\u0005\b§\u0001\u0010\bR\u001d\u0010¨\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b©\u0001\u0010\u0006\"\u0005\bª\u0001\u0010\bR\u001d\u0010«\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¬\u0001\u0010\u0006\"\u0005\b\u00ad\u0001\u0010\bR\u001d\u0010®\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¯\u0001\u0010\u0006\"\u0005\b°\u0001\u0010\bR\u001d\u0010±\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b²\u0001\u0010\u0006\"\u0005\b³\u0001\u0010\bR\u001d\u0010´\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bµ\u0001\u0010\u0006\"\u0005\b¶\u0001\u0010\bR\u001d\u0010·\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¸\u0001\u0010\u0006\"\u0005\b¹\u0001\u0010\bR\u001d\u0010º\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b»\u0001\u0010\u0006\"\u0005\b¼\u0001\u0010\bR\u001d\u0010½\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¾\u0001\u0010\u0006\"\u0005\b¿\u0001\u0010\bR\u001d\u0010À\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÁ\u0001\u0010\u0006\"\u0005\bÂ\u0001\u0010\bR\u001d\u0010Ã\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÄ\u0001\u0010\u0006\"\u0005\bÅ\u0001\u0010\bR\u001d\u0010Æ\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÇ\u0001\u0010\u0006\"\u0005\bÈ\u0001\u0010\bR\u001d\u0010É\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÊ\u0001\u0010\u0006\"\u0005\bË\u0001\u0010\bR\u001d\u0010Ì\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÍ\u0001\u0010\u0006\"\u0005\bÎ\u0001\u0010\bR\u001d\u0010Ï\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÐ\u0001\u0010\u0006\"\u0005\bÑ\u0001\u0010\bR\u001d\u0010Ò\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÓ\u0001\u0010\u0006\"\u0005\bÔ\u0001\u0010\bR\u001d\u0010Õ\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÖ\u0001\u0010\u0006\"\u0005\b×\u0001\u0010\bR\u001d\u0010Ø\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÙ\u0001\u0010\u0006\"\u0005\bÚ\u0001\u0010\bR\u001d\u0010Û\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÜ\u0001\u0010\u0006\"\u0005\bÝ\u0001\u0010\bR\u001d\u0010Þ\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bß\u0001\u0010\u0006\"\u0005\bà\u0001\u0010\bR\u001d\u0010á\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bâ\u0001\u0010\u0006\"\u0005\bã\u0001\u0010\bR\u001d\u0010ä\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bå\u0001\u0010\u0006\"\u0005\bæ\u0001\u0010\bR\u001d\u0010ç\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bè\u0001\u0010\u0006\"\u0005\bé\u0001\u0010\bR\u001d\u0010ê\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bë\u0001\u0010\u0006\"\u0005\bì\u0001\u0010\bR\u001d\u0010í\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bî\u0001\u0010\u0006\"\u0005\bï\u0001\u0010\bR\u001d\u0010ð\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bñ\u0001\u0010\u0006\"\u0005\bò\u0001\u0010\bR\u001d\u0010ó\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bô\u0001\u0010\u0006\"\u0005\bõ\u0001\u0010\bR\u001d\u0010ö\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b÷\u0001\u0010\u0006\"\u0005\bø\u0001\u0010\bR\u001d\u0010ù\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bú\u0001\u0010\u0006\"\u0005\bû\u0001\u0010\bR\u001d\u0010ü\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bý\u0001\u0010\u0006\"\u0005\bþ\u0001\u0010\bR\u001d\u0010ÿ\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0002\u0010\u0006\"\u0005\b\u0081\u0002\u0010\bR\u001d\u0010\u0082\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0083\u0002\u0010\u0006\"\u0005\b\u0084\u0002\u0010\bR\u001d\u0010\u0085\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0002\u0010\u0006\"\u0005\b\u0087\u0002\u0010\bR\u001d\u0010\u0088\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0089\u0002\u0010\u0006\"\u0005\b\u008a\u0002\u0010\bR\u001d\u0010\u008b\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008c\u0002\u0010\u0006\"\u0005\b\u008d\u0002\u0010\bR\u001d\u0010\u008e\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008f\u0002\u0010\u0006\"\u0005\b\u0090\u0002\u0010\bR\u001d\u0010\u0091\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0092\u0002\u0010\u0006\"\u0005\b\u0093\u0002\u0010\bR\u001d\u0010\u0094\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0095\u0002\u0010\u0006\"\u0005\b\u0096\u0002\u0010\bR\u001d\u0010\u0097\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0098\u0002\u0010\u0006\"\u0005\b\u0099\u0002\u0010\bR\u001d\u0010\u009a\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009b\u0002\u0010\u0006\"\u0005\b\u009c\u0002\u0010\bR\u001d\u0010\u009d\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009e\u0002\u0010\u0006\"\u0005\b\u009f\u0002\u0010\bR\u001d\u0010 \u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¡\u0002\u0010\u0006\"\u0005\b¢\u0002\u0010\bR\u001d\u0010£\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¤\u0002\u0010\u0006\"\u0005\b¥\u0002\u0010\bR\u001d\u0010¦\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b§\u0002\u0010\u0006\"\u0005\b¨\u0002\u0010\bR\u001d\u0010©\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bª\u0002\u0010\u0006\"\u0005\b«\u0002\u0010\bR\u001d\u0010¬\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u00ad\u0002\u0010\u0006\"\u0005\b®\u0002\u0010\bR\u001d\u0010¯\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b°\u0002\u0010\u0006\"\u0005\b±\u0002\u0010\bR\u001d\u0010²\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b³\u0002\u0010\u0006\"\u0005\b´\u0002\u0010\bR\u001d\u0010µ\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¶\u0002\u0010\u0006\"\u0005\b·\u0002\u0010\bR\u001d\u0010¸\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¹\u0002\u0010\u0006\"\u0005\bº\u0002\u0010\bR\u001d\u0010»\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¼\u0002\u0010\u0006\"\u0005\b½\u0002\u0010\bR\u001d\u0010¾\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¿\u0002\u0010\u0006\"\u0005\bÀ\u0002\u0010\bR\u001d\u0010Á\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÂ\u0002\u0010\u0006\"\u0005\bÃ\u0002\u0010\bR\u001d\u0010Ä\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÅ\u0002\u0010\u0006\"\u0005\bÆ\u0002\u0010\bR\u001d\u0010Ç\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÈ\u0002\u0010\u0006\"\u0005\bÉ\u0002\u0010\bR\u001d\u0010Ê\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bË\u0002\u0010\u0006\"\u0005\bÌ\u0002\u0010\bR\u001d\u0010Í\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÎ\u0002\u0010\u0006\"\u0005\bÏ\u0002\u0010\bR\u001d\u0010Ð\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÑ\u0002\u0010\u0006\"\u0005\bÒ\u0002\u0010\bR\u001d\u0010Ó\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÔ\u0002\u0010\u0006\"\u0005\bÕ\u0002\u0010\bR\u001d\u0010Ö\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b×\u0002\u0010\u0006\"\u0005\bØ\u0002\u0010\bR\u001d\u0010Ù\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÚ\u0002\u0010\u0006\"\u0005\bÛ\u0002\u0010\bR\u001d\u0010Ü\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÝ\u0002\u0010\u0006\"\u0005\bÞ\u0002\u0010\bR\u001d\u0010ß\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bà\u0002\u0010\u0006\"\u0005\bá\u0002\u0010\bR\u001d\u0010â\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bã\u0002\u0010\u0006\"\u0005\bä\u0002\u0010\bR\u001d\u0010å\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bæ\u0002\u0010\u0006\"\u0005\bç\u0002\u0010\bR\u001d\u0010è\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bé\u0002\u0010\u0006\"\u0005\bê\u0002\u0010\bR\u001d\u0010ë\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bì\u0002\u0010\u0006\"\u0005\bí\u0002\u0010\bR\u001d\u0010î\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bï\u0002\u0010\u0006\"\u0005\bð\u0002\u0010\bR\u001d\u0010ñ\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bò\u0002\u0010\u0006\"\u0005\bó\u0002\u0010\bR\u001d\u0010ô\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bõ\u0002\u0010\u0006\"\u0005\bö\u0002\u0010\bR\u001d\u0010÷\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bø\u0002\u0010\u0006\"\u0005\bù\u0002\u0010\bR\u001d\u0010ú\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bû\u0002\u0010\u0006\"\u0005\bü\u0002\u0010\bR\u001d\u0010ý\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bþ\u0002\u0010\u0006\"\u0005\bÿ\u0002\u0010\bR\u001d\u0010\u0080\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0003\u0010\u0006\"\u0005\b\u0082\u0003\u0010\bR\u001d\u0010\u0083\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0003\u0010\u0006\"\u0005\b\u0085\u0003\u0010\bR\u001d\u0010\u0086\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0003\u0010\u0006\"\u0005\b\u0088\u0003\u0010\bR\u001d\u0010\u0089\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0003\u0010\u0006\"\u0005\b\u008b\u0003\u0010\bR\u001d\u0010\u008c\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008d\u0003\u0010\u0006\"\u0005\b\u008e\u0003\u0010\bR\u001d\u0010\u008f\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0090\u0003\u0010\u0006\"\u0005\b\u0091\u0003\u0010\bR\u001d\u0010\u0092\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0093\u0003\u0010\u0006\"\u0005\b\u0094\u0003\u0010\bR\u001d\u0010\u0095\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0096\u0003\u0010\u0006\"\u0005\b\u0097\u0003\u0010\bR\u001d\u0010\u0098\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0099\u0003\u0010\u0006\"\u0005\b\u009a\u0003\u0010\bR\u001d\u0010\u009b\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009c\u0003\u0010\u0006\"\u0005\b\u009d\u0003\u0010\bR\u001d\u0010\u009e\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009f\u0003\u0010\u0006\"\u0005\b \u0003\u0010\bR\u001d\u0010¡\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¢\u0003\u0010\u0006\"\u0005\b£\u0003\u0010\bR\u001d\u0010¤\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¥\u0003\u0010\u0006\"\u0005\b¦\u0003\u0010\bR\u001d\u0010§\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¨\u0003\u0010\u0006\"\u0005\b©\u0003\u0010\bR\u001d\u0010ª\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b«\u0003\u0010\u0006\"\u0005\b¬\u0003\u0010\bR\u001d\u0010\u00ad\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b®\u0003\u0010\u0006\"\u0005\b¯\u0003\u0010\bR\u001d\u0010°\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b±\u0003\u0010\u0006\"\u0005\b²\u0003\u0010\bR\u001d\u0010³\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b´\u0003\u0010\u0006\"\u0005\bµ\u0003\u0010\bR\u001d\u0010¶\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b·\u0003\u0010\u0006\"\u0005\b¸\u0003\u0010\bR\u001d\u0010¹\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bº\u0003\u0010\u0006\"\u0005\b»\u0003\u0010\bR\u001d\u0010¼\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b½\u0003\u0010\u0006\"\u0005\b¾\u0003\u0010\bR\u001d\u0010¿\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÀ\u0003\u0010\u0006\"\u0005\bÁ\u0003\u0010\bR\u001d\u0010Â\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÃ\u0003\u0010\u0006\"\u0005\bÄ\u0003\u0010\bR\u001d\u0010Å\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÆ\u0003\u0010\u0006\"\u0005\bÇ\u0003\u0010\bR\u001d\u0010È\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÉ\u0003\u0010\u0006\"\u0005\bÊ\u0003\u0010\bR\u001d\u0010Ë\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÌ\u0003\u0010\u0006\"\u0005\bÍ\u0003\u0010\bR\u001d\u0010Î\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÏ\u0003\u0010\u0006\"\u0005\bÐ\u0003\u0010\bR\u001d\u0010Ñ\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÒ\u0003\u0010\u0006\"\u0005\bÓ\u0003\u0010\bR\u001d\u0010Ô\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÕ\u0003\u0010\u0006\"\u0005\bÖ\u0003\u0010\bR\u001d\u0010×\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bØ\u0003\u0010\u0006\"\u0005\bÙ\u0003\u0010\bR\u001d\u0010Ú\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÛ\u0003\u0010\u0006\"\u0005\bÜ\u0003\u0010\bR\u001d\u0010Ý\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÞ\u0003\u0010\u0006\"\u0005\bß\u0003\u0010\bR\u001d\u0010à\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bá\u0003\u0010\u0006\"\u0005\bâ\u0003\u0010\bR\u001d\u0010ã\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bä\u0003\u0010\u0006\"\u0005\bå\u0003\u0010\bR\u001d\u0010æ\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bç\u0003\u0010\u0006\"\u0005\bè\u0003\u0010\bR\u001d\u0010é\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bê\u0003\u0010\u0006\"\u0005\bë\u0003\u0010\bR\u001d\u0010ì\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bí\u0003\u0010\u0006\"\u0005\bî\u0003\u0010\bR\u001d\u0010ï\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bð\u0003\u0010\u0006\"\u0005\bñ\u0003\u0010\bR\u001d\u0010ò\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bó\u0003\u0010\u0006\"\u0005\bô\u0003\u0010\bR\u001d\u0010õ\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bö\u0003\u0010\u0006\"\u0005\b÷\u0003\u0010\bR\u001d\u0010ø\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bù\u0003\u0010\u0006\"\u0005\bú\u0003\u0010\bR\u001d\u0010û\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bü\u0003\u0010\u0006\"\u0005\bý\u0003\u0010\bR\u001d\u0010þ\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÿ\u0003\u0010\u0006\"\u0005\b\u0080\u0004\u0010\bR\u001d\u0010\u0081\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0004\u0010\u0006\"\u0005\b\u0083\u0004\u0010\bR\u001d\u0010\u0084\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0004\u0010\u0006\"\u0005\b\u0086\u0004\u0010\bR\u001d\u0010\u0087\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0088\u0004\u0010\u0006\"\u0005\b\u0089\u0004\u0010\bR\u001d\u0010\u008a\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0004\u0010\u0006\"\u0005\b\u008c\u0004\u0010\bR\u001d\u0010\u008d\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008e\u0004\u0010\u0006\"\u0005\b\u008f\u0004\u0010\bR\u001d\u0010\u0090\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0091\u0004\u0010\u0006\"\u0005\b\u0092\u0004\u0010\bR\u001d\u0010\u0093\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0094\u0004\u0010\u0006\"\u0005\b\u0095\u0004\u0010\bR\u001d\u0010\u0096\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0097\u0004\u0010\u0006\"\u0005\b\u0098\u0004\u0010\bR\u001d\u0010\u0099\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009a\u0004\u0010\u0006\"\u0005\b\u009b\u0004\u0010\bR\u001d\u0010\u009c\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009d\u0004\u0010\u0006\"\u0005\b\u009e\u0004\u0010\bR\u001d\u0010\u009f\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b \u0004\u0010\u0006\"\u0005\b¡\u0004\u0010\bR\u001d\u0010¢\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b£\u0004\u0010\u0006\"\u0005\b¤\u0004\u0010\bR\u001d\u0010¥\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¦\u0004\u0010\u0006\"\u0005\b§\u0004\u0010\bR\u001d\u0010¨\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b©\u0004\u0010\u0006\"\u0005\bª\u0004\u0010\bR\u001d\u0010«\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¬\u0004\u0010\u0006\"\u0005\b\u00ad\u0004\u0010\bR\u001d\u0010®\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¯\u0004\u0010\u0006\"\u0005\b°\u0004\u0010\bR\u001d\u0010±\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b²\u0004\u0010\u0006\"\u0005\b³\u0004\u0010\bR\u001d\u0010´\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bµ\u0004\u0010\u0006\"\u0005\b¶\u0004\u0010\bR\u001d\u0010·\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¸\u0004\u0010\u0006\"\u0005\b¹\u0004\u0010\bR\u001d\u0010º\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b»\u0004\u0010\u0006\"\u0005\b¼\u0004\u0010\bR\u001d\u0010½\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¾\u0004\u0010\u0006\"\u0005\b¿\u0004\u0010\bR\u001d\u0010À\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÁ\u0004\u0010\u0006\"\u0005\bÂ\u0004\u0010\bR\u001d\u0010Ã\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÄ\u0004\u0010\u0006\"\u0005\bÅ\u0004\u0010\bR\u001d\u0010Æ\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÇ\u0004\u0010\u0006\"\u0005\bÈ\u0004\u0010\bR\u001d\u0010É\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÊ\u0004\u0010\u0006\"\u0005\bË\u0004\u0010\bR\u001d\u0010Ì\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÍ\u0004\u0010\u0006\"\u0005\bÎ\u0004\u0010\bR\u001d\u0010Ï\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÐ\u0004\u0010\u0006\"\u0005\bÑ\u0004\u0010\b¨\u0006é\u0004"}, d2 = {"Lcom/Utils/PrintModelUtils$Companion;", "", "()V", "A2", "Lcom/Utils/PrinterModel$DataBean;", "getA2", "()Lcom/Utils/PrinterModel$DataBean;", "setA2", "(Lcom/Utils/PrinterModel$DataBean;)V", "A200", "getA200", "setA200", "A3", "getA3", "setA3", "A33", "getA33", "setA33", "A41II", "getA41II", "setA41II", "A41III", "getA41III", "setA41III", "A42II", "getA42II", "setA42II", "A43", "getA43", "setA43", "A4300", "getA4300", "setA4300", "AiPrint", "getAiPrint", "setAiPrint", "AiPrintT1", "getAiPrintT1", "setAiPrintT1", "AudioPrint", "getAudioPrint", "setAudioPrint", "CLICK_PRINT", "getCLICK_PRINT", "setCLICK_PRINT", "CLICK_SOUND", "getCLICK_SOUND", "setCLICK_SOUND", "CMT_0510", "getCMT_0510", "setCMT_0510", "CP01", "getCP01", "setCP01", "CameraPrint", "getCameraPrint", "setCameraPrint", "D1", "getD1", "setD1", "D100", "getD100", "setD100", "DL_GE225", "getDL_GE225", "setDL_GE225", "DL_X2", "getDL_X2", "setDL_X2", "DL_X2Pro", "getDL_X2Pro", "setDL_X2Pro", "DL_X7", "getDL_X7", "setDL_X7", "DL_X7Pro", "getDL_X7Pro", "setDL_X7Pro", "DT1_0", "getDT1_0", "setDT1_0", "DT1_R", "getDT1_R", "setDT1_R", "DTR_R0", "getDTR_R0", "setDTR_R0", "DY03", "getDY03", "setDY03", "DY33A", "getDY33A", "setDY33A", "DY49", "getDY49", "setDY49", "EA_LBLU1_WH", "getEA_LBLU1_WH", "setEA_LBLU1_WH", "EMX_040256", "getEMX_040256", "setEMX_040256", "FC02", "getFC02", "setFC02", "GB02SH", "getGB02SH", "setGB02SH", "GB03PH", "getGB03PH", "setGB03PH", "GB03PL", "getGB03PL", "setGB03PL", "GB03SH", "getGB03SH", "setGB03SH", "GB03SL", "getGB03SL", "setGB03SL", "GL_VS9", "getGL_VS9", "setGL_VS9", "GT09", "getGT09", "setGT09", "GT10", "getGT10", "setGT10", "GV_MA211", "getGV_MA211", "setGV_MA211", "GW08", "getGW08", "setGW08", "GW09", "getGW09", "setGW09", "HD1", "getHD1", "setHD1", "HT0125", "getHT0125", "setHT0125", "IM_04", "getIM_04", "setIM_04", "IprintIt_Printer", "getIprintIt_Printer", "setIprintIt_Printer", "JRX01", "getJRX01", "setJRX01", "KF_5", "getKF_5", "setKF_5", "KIDYPRINTER", "getKIDYPRINTER", "setKIDYPRINTER", "KS_1", "getKS_1", "setKS_1", "L1", "getL1", "setL1", "LGM01", "getLGM01", "setLGM01", "LISCIANI", "getLISCIANI", "setLISCIANI", "LP6", "getLP6", "setLP6", "Label_Printer", "getLabel_Printer", "setLabel_Printer", "Luxorp_PX10", "getLuxorp_PX10", "setLuxorp_PX10", "ML_MP_01", "getML_MP_01", "setML_MP_01", "MPA81", "getMPA81", "setMPA81", "MTPR26BK", "getMTPR26BK", "setMTPR26BK", "MVMT_INK", "getMVMT_INK", "setMVMT_INK", "MV_B530", "getMV_B530", "setMV_B530", "MiniPrinter", "getMiniPrinter", "setMiniPrinter", "P2", "getP2", "setP2", "P20max", "getP20max", "setP20max", "P4", "getP4", "setP4", "P5", "getP5", "setP5", "P6", "getP6", "setP6", "P7H", "getP7H", "setP7H", "PR08", "getPR08", "setPR08", "PT001", "getPT001", "setPT001", "Pocket_Printer", "getPocket_Printer", "setPocket_Printer", "Professional_Printer", "getProfessional_Printer", "setProfessional_Printer", "QDID", "getQDID", "setQDID", "QDX01", "getQDX01", "setQDX01", "ROSSMANN", "getROSSMANN", "setROSSMANN", "RS9000", "getRS9000", "setRS9000", "S5A", "getS5A", "setS5A", "S600", "getS600", "setS600", "S9A", "getS9A", "setS9A", "SC03H", "getSC03H", "setSC03H", "SeznikEcho", "getSeznikEcho", "setSeznikEcho", "SeznikNeo", "getSeznikNeo", "setSeznikNeo", "Shipping_Printer", "getShipping_Printer", "setShipping_Printer", "Shipping_Printer2", "getShipping_Printer2", "setShipping_Printer2", "TCM690464", "getTCM690464", "setTCM690464", "TD11308", "getTD11308", "setTD11308", "TRAiPrinter", "getTRAiPrinter", "setTRAiPrinter", "Totori", "getTotori", "setTotori", "U1", "getU1", "setU1", "U2", "getU2", "setU2", "UXPORTMIP", "getUXPORTMIP", "setUXPORTMIP", "VOICE_PRINT", "getVOICE_PRINT", "setVOICE_PRINT", "WJ_HOT_PRT", "getWJ_HOT_PRT", "setWJ_HOT_PRT", "WL01", "getWL01", "setWL01", "WQ02", "getWQ02", "setWQ02", "X103H", "getX103H", "setX103H", "X103h", "getX103h", "setX103h", "X16", "getX16", "setX16", "X18", "getX18", "setX18", "XC9", "getXC9", "setXC9", "XC9_FL01", "getXC9_FL01", "setXC9_FL01", "YK_06", "getYK_06", "setYK_06", "YMS_BT01", "getYMS_BT01", "setYMS_BT01", "ZHHC", "getZHHC", "setZHHC", "ZP801", "getZP801", "setZP801", "ZP802", "getZP802", "setZP802", "ZPA4Z1", "getZPA4Z1", "setZPA4Z1", "_0019B_C", "get_0019B_C", "set_0019B_C", "_0019B_D", "get_0019B_D", "set_0019B_D", "_15P3", "get_15P3", "set_15P3", "_58p5", "get_58p5", "set_58p5", "ai01", "getAi01", "setAi01", "an01", "getAn01", "setAn01", "dy01", "getDy01", "setDy01", "ewtto_ET_Z0504", "getEwtto_ET_Z0504", "setEwtto_ET_Z0504", "fl01", "getFl01", "setFl01", "gb01", "getGb01", "setGb01", "gb02", "getGb02", "setGb02", "gb03", "getGb03", "setGb03", "gb03_n", "getGb03_n", "setGb03_n", "gb04", "getGb04", "setGb04", "gb05", "getGb05", "setGb05", "gb06", "getGb06", "setGb06", "gb06_n", "getGb06_n", "setGb06_n", "gt01", "getGt01", "setGt01", "gt02", "getGt02", "setGt02", "gt03", "getGt03", "setGt03", "gt04", "getGt04", "setGt04", "gt08", "getGt08", "setGt08", "jx001", "getJx001", "setJx001", "jxm008", "getJxm008", "setJxm008", "lp100", "getLp100", "setLp100", "lt01", "getLt01", "setLt01", "ly01", "getLy01", "setLy01", "ly02", "getLy02", "setLy02", "ly03", "getLy03", "setLy03", "ly05", "getLy05", "setLy05", "ly10", "getLy10", "setLy10", "ly11", "getLy11", "setLy11", "m01", "getM01", "setM01", "m2", "getM2", "setM2", "p1", "getP1", "setP1", "p10", "getP10", "setP10", "p5ai", "getP5ai", "setP5ai", "p7", "getP7", "setP7", "pr02", "getPr02", "setPr02", "pr07", "getPr07", "setPr07", "pr30", "getPr30", "setPr30", "pr35", "getPr35", "setPr35", "pr88", "getPr88", "setPr88", "pr89", "getPr89", "setPr89", "pr891", "getPr891", "setPr891", "pr893", "getPr893", "setPr893", "rt034h", "getRt034h", "setRt034h", "s01", "getS01", "setS01", "s101", "getS101", "setS101", "s101_n", "getS101_n", "setS101_n", "s102", "getS102", "setS102", "s102_n", "getS102_n", "setS102_n", "s5", "getS5", "setS5", "sc03", "getSc03", "setSc03", "sc03h", "getSc03h", "setSc03h", "sc04", "getSc04", "setSc04", "sc04h", "getSc04h", "setSc04h", "sc05", "getSc05", "setSc05", "wts07", "getWts07", "setWts07", SvgConstants.Attributes.X1, "getX1", "setX1", "x100", "getX100", "setX100", "x101H", "getX101H", "setX101H", "x102", "getX102", "setX102", "x2H", "getX2H", "setX2H", "x2h", "getX2h", "setX2h", "x5", "getX5", "setX5", "x5H", "getX5H", "setX5H", "x5HP", "getX5HP", "setX5HP", "x5_n", "getX5_n", "setX5_n", "x5h", "getX5h", "setX5h", "x6", "getX6", "setX6", "x6H", "getX6H", "setX6H", "x6HP", "getX6HP", "setX6HP", "x6_n", "getX6_n", "setX6_n", "x6h", "getX6h", "setX6h", "x7", "getX7", "setX7", "x7H", "getX7H", "setX7H", "x7HP", "getX7HP", "setX7HP", "x7_n", "getX7_n", "setX7_n", "x7h", "getX7h", "setX7h", "x8", "getX8", "setX8", "x8l", "getX8l", "setX8l", "x8w", "getX8w", "setX8w", "x9", "getX9", "setX9", "xw001", "getXw001", "setXw001", "xw002", "getXw002", "setXw002", "xw003", "getXw003", "setXw003", "getBole", "", "getCorePrint", "getData", "appName", "getData_iPrint", "getData_iPrint_b", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getData_jzxx", "getData_jzxx_b", "getData_tinyPrint", "getData_tinyPrint_b", "getData_zhiwuya", "getData_zhiwuya_b", "getDeLi", "getFreeTattoo", "getGelin", "getPrintCamera", "getSDK", "getShuanghou", "getYiFeng", "getYiYiTong", "StringLib_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PrinterModel.DataBean getXw001() {
            return PrintModelUtils.xw001;
        }

        public final void setXw001(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.xw001 = dataBean;
        }

        public final PrinterModel.DataBean getXw002() {
            return PrintModelUtils.xw002;
        }

        public final void setXw002(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.xw002 = dataBean;
        }

        public final PrinterModel.DataBean getXw003() {
            return PrintModelUtils.xw003;
        }

        public final void setXw003(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.xw003 = dataBean;
        }

        public final PrinterModel.DataBean getJx001() {
            return PrintModelUtils.jx001;
        }

        public final void setJx001(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.jx001 = dataBean;
        }

        public final PrinterModel.DataBean getJxm008() {
            return PrintModelUtils.jxm008;
        }

        public final void setJxm008(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.jxm008 = dataBean;
        }

        public final PrinterModel.DataBean getM01() {
            return PrintModelUtils.m01;
        }

        public final void setM01(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.m01 = dataBean;
        }

        public final PrinterModel.DataBean getGb01() {
            return PrintModelUtils.gb01;
        }

        public final void setGb01(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.gb01 = dataBean;
        }

        public final PrinterModel.DataBean getGb02() {
            return PrintModelUtils.gb02;
        }

        public final void setGb02(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.gb02 = dataBean;
        }

        public final PrinterModel.DataBean getGb03() {
            return PrintModelUtils.gb03;
        }

        public final void setGb03(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.gb03 = dataBean;
        }

        public final PrinterModel.DataBean getGb03_n() {
            return PrintModelUtils.gb03_n;
        }

        public final void setGb03_n(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.gb03_n = dataBean;
        }

        public final PrinterModel.DataBean getCMT_0510() {
            return PrintModelUtils.CMT_0510;
        }

        public final void setCMT_0510(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.CMT_0510 = dataBean;
        }

        public final PrinterModel.DataBean getGV_MA211() {
            return PrintModelUtils.GV_MA211;
        }

        public final void setGV_MA211(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.GV_MA211 = dataBean;
        }

        public final PrinterModel.DataBean getSc03() {
            return PrintModelUtils.sc03;
        }

        public final void setSc03(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.sc03 = dataBean;
        }

        public final PrinterModel.DataBean getFl01() {
            return PrintModelUtils.fl01;
        }

        public final void setFl01(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.fl01 = dataBean;
        }

        public final PrinterModel.DataBean getKF_5() {
            return PrintModelUtils.KF_5;
        }

        public final void setKF_5(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.KF_5 = dataBean;
        }

        public final PrinterModel.DataBean getSc04() {
            return PrintModelUtils.sc04;
        }

        public final void setSc04(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.sc04 = dataBean;
        }

        public final PrinterModel.DataBean getGb04() {
            return PrintModelUtils.gb04;
        }

        public final void setGb04(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.gb04 = dataBean;
        }

        public final PrinterModel.DataBean getGb05() {
            return PrintModelUtils.gb05;
        }

        public final void setGb05(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.gb05 = dataBean;
        }

        public final PrinterModel.DataBean getGb06() {
            return PrintModelUtils.gb06;
        }

        public final void setGb06(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.gb06 = dataBean;
        }

        public final PrinterModel.DataBean getGb06_n() {
            return PrintModelUtils.gb06_n;
        }

        public final void setGb06_n(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.gb06_n = dataBean;
        }

        public final PrinterModel.DataBean getGt01() {
            return PrintModelUtils.gt01;
        }

        public final void setGt01(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.gt01 = dataBean;
        }

        public final PrinterModel.DataBean getGt02() {
            return PrintModelUtils.gt02;
        }

        public final void setGt02(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.gt02 = dataBean;
        }

        public final PrinterModel.DataBean get_58p5() {
            return PrintModelUtils._58p5;
        }

        public final void set_58p5(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils._58p5 = dataBean;
        }

        public final PrinterModel.DataBean getWL01() {
            return PrintModelUtils.WL01;
        }

        public final void setWL01(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.WL01 = dataBean;
        }

        public final PrinterModel.DataBean getX5() {
            return PrintModelUtils.x5;
        }

        public final void setX5(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.x5 = dataBean;
        }

        public final PrinterModel.DataBean getX5_n() {
            return PrintModelUtils.x5_n;
        }

        public final void setX5_n(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.x5_n = dataBean;
        }

        public final PrinterModel.DataBean getX7() {
            return PrintModelUtils.x7;
        }

        public final void setX7(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.x7 = dataBean;
        }

        public final PrinterModel.DataBean getX7_n() {
            return PrintModelUtils.x7_n;
        }

        public final void setX7_n(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.x7_n = dataBean;
        }

        public final PrinterModel.DataBean getS102() {
            return PrintModelUtils.s102;
        }

        public final void setS102(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.s102 = dataBean;
        }

        public final PrinterModel.DataBean getS102_n() {
            return PrintModelUtils.s102_n;
        }

        public final void setS102_n(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.s102_n = dataBean;
        }

        public final PrinterModel.DataBean getLy02() {
            return PrintModelUtils.ly02;
        }

        public final void setLy02(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.ly02 = dataBean;
        }

        public final PrinterModel.DataBean getLy05() {
            return PrintModelUtils.ly05;
        }

        public final void setLy05(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.ly05 = dataBean;
        }

        public final PrinterModel.DataBean getX1() {
            return PrintModelUtils.x1;
        }

        public final void setX1(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.x1 = dataBean;
        }

        public final PrinterModel.DataBean getHD1() {
            return PrintModelUtils.HD1;
        }

        public final void setHD1(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.HD1 = dataBean;
        }

        public final PrinterModel.DataBean getPr30() {
            return PrintModelUtils.pr30;
        }

        public final void setPr30(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.pr30 = dataBean;
        }

        public final PrinterModel.DataBean getPr02() {
            return PrintModelUtils.pr02;
        }

        public final void setPr02(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.pr02 = dataBean;
        }

        public final PrinterModel.DataBean getP10() {
            return PrintModelUtils.p10;
        }

        public final void setP10(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.p10 = dataBean;
        }

        public final PrinterModel.DataBean getP7() {
            return PrintModelUtils.p7;
        }

        public final void setP7(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.p7 = dataBean;
        }

        public final PrinterModel.DataBean getX6() {
            return PrintModelUtils.x6;
        }

        public final void setX6(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.x6 = dataBean;
        }

        public final PrinterModel.DataBean getX6_n() {
            return PrintModelUtils.x6_n;
        }

        public final void setX6_n(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.x6_n = dataBean;
        }

        public final PrinterModel.DataBean getDy01() {
            return PrintModelUtils.dy01;
        }

        public final void setDy01(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.dy01 = dataBean;
        }

        public final PrinterModel.DataBean getIprintIt_Printer() {
            return PrintModelUtils.IprintIt_Printer;
        }

        public final void setIprintIt_Printer(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.IprintIt_Printer = dataBean;
        }

        public final PrinterModel.DataBean getLP6() {
            return PrintModelUtils.LP6;
        }

        public final void setLP6(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.LP6 = dataBean;
        }

        public final PrinterModel.DataBean getPr35() {
            return PrintModelUtils.pr35;
        }

        public final void setPr35(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.pr35 = dataBean;
        }

        public final PrinterModel.DataBean getS01() {
            return PrintModelUtils.s01;
        }

        public final void setS01(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.s01 = dataBean;
        }

        public final PrinterModel.DataBean getLt01() {
            return PrintModelUtils.lt01;
        }

        public final void setLt01(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.lt01 = dataBean;
        }

        public final PrinterModel.DataBean getGt08() {
            return PrintModelUtils.gt08;
        }

        public final void setGt08(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.gt08 = dataBean;
        }

        public final PrinterModel.DataBean getGW08() {
            return PrintModelUtils.GW08;
        }

        public final void setGW08(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.GW08 = dataBean;
        }

        public final PrinterModel.DataBean getGW09() {
            return PrintModelUtils.GW09;
        }

        public final void setGW09(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.GW09 = dataBean;
        }

        public final PrinterModel.DataBean getPr88() {
            return PrintModelUtils.pr88;
        }

        public final void setPr88(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.pr88 = dataBean;
        }

        public final PrinterModel.DataBean getPr89() {
            return PrintModelUtils.pr89;
        }

        public final void setPr89(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.pr89 = dataBean;
        }

        public final PrinterModel.DataBean getPr891() {
            return PrintModelUtils.pr891;
        }

        public final void setPr891(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.pr891 = dataBean;
        }

        public final PrinterModel.DataBean getX8l() {
            return PrintModelUtils.x8l;
        }

        public final void setX8l(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.x8l = dataBean;
        }

        public final PrinterModel.DataBean getX8w() {
            return PrintModelUtils.x8w;
        }

        public final void setX8w(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.x8w = dataBean;
        }

        public final PrinterModel.DataBean getZP801() {
            return PrintModelUtils.ZP801;
        }

        public final void setZP801(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.ZP801 = dataBean;
        }

        public final PrinterModel.DataBean getPr893() {
            return PrintModelUtils.pr893;
        }

        public final void setPr893(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.pr893 = dataBean;
        }

        public final PrinterModel.DataBean getA43() {
            return PrintModelUtils.A43;
        }

        public final void setA43(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.A43 = dataBean;
        }

        public final PrinterModel.DataBean getA4300() {
            return PrintModelUtils.A4300;
        }

        public final void setA4300(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.A4300 = dataBean;
        }

        public final PrinterModel.DataBean getMPA81() {
            return PrintModelUtils.MPA81;
        }

        public final void setMPA81(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.MPA81 = dataBean;
        }

        public final PrinterModel.DataBean getP4() {
            return PrintModelUtils.P4;
        }

        public final void setP4(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.P4 = dataBean;
        }

        public final PrinterModel.DataBean getX9() {
            return PrintModelUtils.x9;
        }

        public final void setX9(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.x9 = dataBean;
        }

        public final PrinterModel.DataBean getMV_B530() {
            return PrintModelUtils.MV_B530;
        }

        public final void setMV_B530(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.MV_B530 = dataBean;
        }

        public final PrinterModel.DataBean getQDID() {
            return PrintModelUtils.QDID;
        }

        public final void setQDID(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.QDID = dataBean;
        }

        public final PrinterModel.DataBean getGL_VS9() {
            return PrintModelUtils.GL_VS9;
        }

        public final void setGL_VS9(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.GL_VS9 = dataBean;
        }

        public final PrinterModel.DataBean getZP802() {
            return PrintModelUtils.ZP802;
        }

        public final void setZP802(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.ZP802 = dataBean;
        }

        public final PrinterModel.DataBean getZPA4Z1() {
            return PrintModelUtils.ZPA4Z1;
        }

        public final void setZPA4Z1(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.ZPA4Z1 = dataBean;
        }

        public final PrinterModel.DataBean getA42II() {
            return PrintModelUtils.A42II;
        }

        public final void setA42II(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.A42II = dataBean;
        }

        public final PrinterModel.DataBean getA41II() {
            return PrintModelUtils.A41II;
        }

        public final void setA41II(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.A41II = dataBean;
        }

        public final PrinterModel.DataBean getA41III() {
            return PrintModelUtils.A41III;
        }

        public final void setA41III(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.A41III = dataBean;
        }

        public final PrinterModel.DataBean getX8() {
            return PrintModelUtils.x8;
        }

        public final void setX8(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.x8 = dataBean;
        }

        public final PrinterModel.DataBean getS101() {
            return PrintModelUtils.s101;
        }

        public final void setS101(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.s101 = dataBean;
        }

        public final PrinterModel.DataBean getS101_n() {
            return PrintModelUtils.s101_n;
        }

        public final void setS101_n(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.s101_n = dataBean;
        }

        public final PrinterModel.DataBean getPr07() {
            return PrintModelUtils.pr07;
        }

        public final void setPr07(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.pr07 = dataBean;
        }

        public final PrinterModel.DataBean getLy01() {
            return PrintModelUtils.ly01;
        }

        public final void setLy01(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.ly01 = dataBean;
        }

        public final PrinterModel.DataBean getLy03() {
            return PrintModelUtils.ly03;
        }

        public final void setLy03(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.ly03 = dataBean;
        }

        public final PrinterModel.DataBean getGt03() {
            return PrintModelUtils.gt03;
        }

        public final void setGt03(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.gt03 = dataBean;
        }

        public final PrinterModel.DataBean getGt04() {
            return PrintModelUtils.gt04;
        }

        public final void setGt04(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.gt04 = dataBean;
        }

        public final PrinterModel.DataBean getP5ai() {
            return PrintModelUtils.p5ai;
        }

        public final void setP5ai(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.p5ai = dataBean;
        }

        public final PrinterModel.DataBean getLy10() {
            return PrintModelUtils.ly10;
        }

        public final void setLy10(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.ly10 = dataBean;
        }

        public final PrinterModel.DataBean getLy11() {
            return PrintModelUtils.ly11;
        }

        public final void setLy11(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.ly11 = dataBean;
        }

        public final PrinterModel.DataBean getLp100() {
            return PrintModelUtils.lp100;
        }

        public final void setLp100(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.lp100 = dataBean;
        }

        public final PrinterModel.DataBean getAi01() {
            return PrintModelUtils.ai01;
        }

        public final void setAi01(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.ai01 = dataBean;
        }

        public final PrinterModel.DataBean getM2() {
            return PrintModelUtils.m2;
        }

        public final void setM2(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.m2 = dataBean;
        }

        public final PrinterModel.DataBean getZHHC() {
            return PrintModelUtils.ZHHC;
        }

        public final void setZHHC(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.ZHHC = dataBean;
        }

        public final PrinterModel.DataBean getP6() {
            return PrintModelUtils.P6;
        }

        public final void setP6(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.P6 = dataBean;
        }

        public final PrinterModel.DataBean getP7H() {
            return PrintModelUtils.P7H;
        }

        public final void setP7H(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.P7H = dataBean;
        }

        public final PrinterModel.DataBean getX2H() {
            return PrintModelUtils.x2H;
        }

        public final void setX2H(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.x2H = dataBean;
        }

        public final PrinterModel.DataBean getX102() {
            return PrintModelUtils.x102;
        }

        public final void setX102(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.x102 = dataBean;
        }

        public final PrinterModel.DataBean getX6HP() {
            return PrintModelUtils.x6HP;
        }

        public final void setX6HP(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.x6HP = dataBean;
        }

        public final PrinterModel.DataBean getX5HP() {
            return PrintModelUtils.x5HP;
        }

        public final void setX5HP(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.x5HP = dataBean;
        }

        public final PrinterModel.DataBean getX7HP() {
            return PrintModelUtils.x7HP;
        }

        public final void setX7HP(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.x7HP = dataBean;
        }

        public final PrinterModel.DataBean getEwtto_ET_Z0504() {
            return PrintModelUtils.ewtto_ET_Z0504;
        }

        public final void setEwtto_ET_Z0504(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.ewtto_ET_Z0504 = dataBean;
        }

        public final PrinterModel.DataBean getX103H() {
            return PrintModelUtils.X103H;
        }

        public final void setX103H(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.X103H = dataBean;
        }

        public final PrinterModel.DataBean getX103h() {
            return PrintModelUtils.X103h;
        }

        public final void setX103h(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.X103h = dataBean;
        }

        public final PrinterModel.DataBean getX6H() {
            return PrintModelUtils.x6H;
        }

        public final void setX6H(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.x6H = dataBean;
        }

        public final PrinterModel.DataBean getX5H() {
            return PrintModelUtils.x5H;
        }

        public final void setX5H(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.x5H = dataBean;
        }

        public final PrinterModel.DataBean getAn01() {
            return PrintModelUtils.an01;
        }

        public final void setAn01(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.an01 = dataBean;
        }

        public final PrinterModel.DataBean getS5() {
            return PrintModelUtils.s5;
        }

        public final void setS5(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.s5 = dataBean;
        }

        public final PrinterModel.DataBean getCP01() {
            return PrintModelUtils.CP01;
        }

        public final void setCP01(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.CP01 = dataBean;
        }

        public final PrinterModel.DataBean getS5A() {
            return PrintModelUtils.S5A;
        }

        public final void setS5A(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.S5A = dataBean;
        }

        public final PrinterModel.DataBean getP20max() {
            return PrintModelUtils.P20max;
        }

        public final void setP20max(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.P20max = dataBean;
        }

        public final PrinterModel.DataBean getS9A() {
            return PrintModelUtils.S9A;
        }

        public final void setS9A(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.S9A = dataBean;
        }

        public final PrinterModel.DataBean getDY33A() {
            return PrintModelUtils.DY33A;
        }

        public final void setDY33A(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.DY33A = dataBean;
        }

        public final PrinterModel.DataBean getYMS_BT01() {
            return PrintModelUtils.YMS_BT01;
        }

        public final void setYMS_BT01(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.YMS_BT01 = dataBean;
        }

        public final PrinterModel.DataBean getWJ_HOT_PRT() {
            return PrintModelUtils.WJ_HOT_PRT;
        }

        public final void setWJ_HOT_PRT(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.WJ_HOT_PRT = dataBean;
        }

        public final PrinterModel.DataBean getSeznikNeo() {
            return PrintModelUtils.SeznikNeo;
        }

        public final void setSeznikNeo(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.SeznikNeo = dataBean;
        }

        public final PrinterModel.DataBean getJRX01() {
            return PrintModelUtils.JRX01;
        }

        public final void setJRX01(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.JRX01 = dataBean;
        }

        public final PrinterModel.DataBean getRS9000() {
            return PrintModelUtils.RS9000;
        }

        public final void setRS9000(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.RS9000 = dataBean;
        }

        public final PrinterModel.DataBean getDY49() {
            return PrintModelUtils.DY49;
        }

        public final void setDY49(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.DY49 = dataBean;
        }

        public final PrinterModel.DataBean getQDX01() {
            return PrintModelUtils.QDX01;
        }

        public final void setQDX01(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.QDX01 = dataBean;
        }

        public final PrinterModel.DataBean getWts07() {
            return PrintModelUtils.wts07;
        }

        public final void setWts07(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.wts07 = dataBean;
        }

        public final PrinterModel.DataBean getGT10() {
            return PrintModelUtils.GT10;
        }

        public final void setGT10(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.GT10 = dataBean;
        }

        public final PrinterModel.DataBean getGT09() {
            return PrintModelUtils.GT09;
        }

        public final void setGT09(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.GT09 = dataBean;
        }

        public final PrinterModel.DataBean getA200() {
            return PrintModelUtils.A200;
        }

        public final void setA200(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.A200 = dataBean;
        }

        public final PrinterModel.DataBean getX7H() {
            return PrintModelUtils.x7H;
        }

        public final void setX7H(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.x7H = dataBean;
        }

        public final PrinterModel.DataBean getX2h() {
            return PrintModelUtils.x2h;
        }

        public final void setX2h(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.x2h = dataBean;
        }

        public final PrinterModel.DataBean getX5h() {
            return PrintModelUtils.x5h;
        }

        public final void setX5h(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.x5h = dataBean;
        }

        public final PrinterModel.DataBean getMTPR26BK() {
            return PrintModelUtils.MTPR26BK;
        }

        public final void setMTPR26BK(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.MTPR26BK = dataBean;
        }

        public final PrinterModel.DataBean getML_MP_01() {
            return PrintModelUtils.ML_MP_01;
        }

        public final void setML_MP_01(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.ML_MP_01 = dataBean;
        }

        public final PrinterModel.DataBean getLuxorp_PX10() {
            return PrintModelUtils.Luxorp_PX10;
        }

        public final void setLuxorp_PX10(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.Luxorp_PX10 = dataBean;
        }

        public final PrinterModel.DataBean getDTR_R0() {
            return PrintModelUtils.DTR_R0;
        }

        public final void setDTR_R0(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.DTR_R0 = dataBean;
        }

        public final PrinterModel.DataBean getROSSMANN() {
            return PrintModelUtils.ROSSMANN;
        }

        public final void setROSSMANN(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.ROSSMANN = dataBean;
        }

        public final PrinterModel.DataBean getX18() {
            return PrintModelUtils.X18;
        }

        public final void setX18(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.X18 = dataBean;
        }

        public final PrinterModel.DataBean getCLICK_SOUND() {
            return PrintModelUtils.CLICK_SOUND;
        }

        public final void setCLICK_SOUND(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.CLICK_SOUND = dataBean;
        }

        public final PrinterModel.DataBean getCLICK_PRINT() {
            return PrintModelUtils.CLICK_PRINT;
        }

        public final void setCLICK_PRINT(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.CLICK_PRINT = dataBean;
        }

        public final PrinterModel.DataBean getDT1_R() {
            return PrintModelUtils.DT1_R;
        }

        public final void setDT1_R(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.DT1_R = dataBean;
        }

        public final PrinterModel.DataBean getMVMT_INK() {
            return PrintModelUtils.MVMT_INK;
        }

        public final void setMVMT_INK(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.MVMT_INK = dataBean;
        }

        public final PrinterModel.DataBean get_0019B_D() {
            return PrintModelUtils._0019B_D;
        }

        public final void set_0019B_D(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils._0019B_D = dataBean;
        }

        public final PrinterModel.DataBean getEMX_040256() {
            return PrintModelUtils.EMX_040256;
        }

        public final void setEMX_040256(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.EMX_040256 = dataBean;
        }

        public final PrinterModel.DataBean getHT0125() {
            return PrintModelUtils.HT0125;
        }

        public final void setHT0125(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.HT0125 = dataBean;
        }

        public final PrinterModel.DataBean getDT1_0() {
            return PrintModelUtils.DT1_0;
        }

        public final void setDT1_0(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.DT1_0 = dataBean;
        }

        public final PrinterModel.DataBean getX7h() {
            return PrintModelUtils.x7h;
        }

        public final void setX7h(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.x7h = dataBean;
        }

        public final PrinterModel.DataBean get_0019B_C() {
            return PrintModelUtils._0019B_C;
        }

        public final void set_0019B_C(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils._0019B_C = dataBean;
        }

        public final PrinterModel.DataBean getX100() {
            return PrintModelUtils.x100;
        }

        public final void setX100(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.x100 = dataBean;
        }

        public final PrinterModel.DataBean getX101H() {
            return PrintModelUtils.x101H;
        }

        public final void setX101H(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.x101H = dataBean;
        }

        public final PrinterModel.DataBean getLGM01() {
            return PrintModelUtils.LGM01;
        }

        public final void setLGM01(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.LGM01 = dataBean;
        }

        public final PrinterModel.DataBean getP1() {
            return PrintModelUtils.p1;
        }

        public final void setP1(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.p1 = dataBean;
        }

        public final PrinterModel.DataBean getDY03() {
            return PrintModelUtils.DY03;
        }

        public final void setDY03(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.DY03 = dataBean;
        }

        public final PrinterModel.DataBean getSc03h() {
            return PrintModelUtils.sc03h;
        }

        public final void setSc03h(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.sc03h = dataBean;
        }

        public final PrinterModel.DataBean getTD11308() {
            return PrintModelUtils.TD11308;
        }

        public final void setTD11308(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.TD11308 = dataBean;
        }

        public final PrinterModel.DataBean getP5() {
            return PrintModelUtils.P5;
        }

        public final void setP5(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.P5 = dataBean;
        }

        public final PrinterModel.DataBean getXC9() {
            return PrintModelUtils.XC9;
        }

        public final void setXC9(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.XC9 = dataBean;
        }

        public final PrinterModel.DataBean getXC9_FL01() {
            return PrintModelUtils.XC9_FL01;
        }

        public final void setXC9_FL01(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.XC9_FL01 = dataBean;
        }

        public final PrinterModel.DataBean getPT001() {
            return PrintModelUtils.PT001;
        }

        public final void setPT001(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.PT001 = dataBean;
        }

        public final PrinterModel.DataBean getSc04h() {
            return PrintModelUtils.sc04h;
        }

        public final void setSc04h(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.sc04h = dataBean;
        }

        public final PrinterModel.DataBean getP2() {
            return PrintModelUtils.P2;
        }

        public final void setP2(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.P2 = dataBean;
        }

        public final PrinterModel.DataBean getSc05() {
            return PrintModelUtils.sc05;
        }

        public final void setSc05(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.sc05 = dataBean;
        }

        public final PrinterModel.DataBean getIM_04() {
            return PrintModelUtils.IM_04;
        }

        public final void setIM_04(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.IM_04 = dataBean;
        }

        public final PrinterModel.DataBean getRt034h() {
            return PrintModelUtils.rt034h;
        }

        public final void setRt034h(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.rt034h = dataBean;
        }

        public final PrinterModel.DataBean getD1() {
            return PrintModelUtils.D1;
        }

        public final void setD1(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.D1 = dataBean;
        }

        public final PrinterModel.DataBean getUXPORTMIP() {
            return PrintModelUtils.UXPORTMIP;
        }

        public final void setUXPORTMIP(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.UXPORTMIP = dataBean;
        }

        public final PrinterModel.DataBean getGB03SL() {
            return PrintModelUtils.GB03SL;
        }

        public final void setGB03SL(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.GB03SL = dataBean;
        }

        public final PrinterModel.DataBean getGB03SH() {
            return PrintModelUtils.GB03SH;
        }

        public final void setGB03SH(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.GB03SH = dataBean;
        }

        public final PrinterModel.DataBean getFC02() {
            return PrintModelUtils.FC02;
        }

        public final void setFC02(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.FC02 = dataBean;
        }

        public final PrinterModel.DataBean getA33() {
            return PrintModelUtils.A33;
        }

        public final void setA33(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.A33 = dataBean;
        }

        public final PrinterModel.DataBean getSC03H() {
            return PrintModelUtils.SC03H;
        }

        public final void setSC03H(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.SC03H = dataBean;
        }

        public final PrinterModel.DataBean getGB03PL() {
            return PrintModelUtils.GB03PL;
        }

        public final void setGB03PL(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.GB03PL = dataBean;
        }

        public final PrinterModel.DataBean getGB03PH() {
            return PrintModelUtils.GB03PH;
        }

        public final void setGB03PH(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.GB03PH = dataBean;
        }

        public final PrinterModel.DataBean getGB02SH() {
            return PrintModelUtils.GB02SH;
        }

        public final void setGB02SH(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.GB02SH = dataBean;
        }

        public final PrinterModel.DataBean getPocket_Printer() {
            return PrintModelUtils.Pocket_Printer;
        }

        public final void setPocket_Printer(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.Pocket_Printer = dataBean;
        }

        public final PrinterModel.DataBean getTCM690464() {
            return PrintModelUtils.TCM690464;
        }

        public final void setTCM690464(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.TCM690464 = dataBean;
        }

        public final PrinterModel.DataBean get_15P3() {
            return PrintModelUtils._15P3;
        }

        public final void set_15P3(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils._15P3 = dataBean;
        }

        public final PrinterModel.DataBean getYK_06() {
            return PrintModelUtils.YK_06;
        }

        public final void setYK_06(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.YK_06 = dataBean;
        }

        public final PrinterModel.DataBean getWQ02() {
            return PrintModelUtils.WQ02;
        }

        public final void setWQ02(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.WQ02 = dataBean;
        }

        public final PrinterModel.DataBean getL1() {
            return PrintModelUtils.L1;
        }

        public final void setL1(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.L1 = dataBean;
        }

        public final PrinterModel.DataBean getU2() {
            return PrintModelUtils.U2;
        }

        public final void setU2(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.U2 = dataBean;
        }

        public final PrinterModel.DataBean getX16() {
            return PrintModelUtils.X16;
        }

        public final void setX16(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.X16 = dataBean;
        }

        public final PrinterModel.DataBean getAudioPrint() {
            return PrintModelUtils.AudioPrint;
        }

        public final void setAudioPrint(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.AudioPrint = dataBean;
        }

        public final PrinterModel.DataBean getTRAiPrinter() {
            return PrintModelUtils.TRAiPrinter;
        }

        public final void setTRAiPrinter(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.TRAiPrinter = dataBean;
        }

        public final PrinterModel.DataBean getTotori() {
            return PrintModelUtils.Totori;
        }

        public final void setTotori(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.Totori = dataBean;
        }

        public final PrinterModel.DataBean getVOICE_PRINT() {
            return PrintModelUtils.VOICE_PRINT;
        }

        public final void setVOICE_PRINT(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.VOICE_PRINT = dataBean;
        }

        public final PrinterModel.DataBean getKIDYPRINTER() {
            return PrintModelUtils.KIDYPRINTER;
        }

        public final void setKIDYPRINTER(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.KIDYPRINTER = dataBean;
        }

        public final PrinterModel.DataBean getLISCIANI() {
            return PrintModelUtils.LISCIANI;
        }

        public final void setLISCIANI(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.LISCIANI = dataBean;
        }

        public final PrinterModel.DataBean getAiPrint() {
            return PrintModelUtils.AiPrint;
        }

        public final void setAiPrint(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.AiPrint = dataBean;
        }

        public final PrinterModel.DataBean getAiPrintT1() {
            return PrintModelUtils.AiPrintT1;
        }

        public final void setAiPrintT1(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.AiPrintT1 = dataBean;
        }

        public final PrinterModel.DataBean getA2() {
            return PrintModelUtils.A2;
        }

        public final void setA2(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.A2 = dataBean;
        }

        public final PrinterModel.DataBean getA3() {
            return PrintModelUtils.A3;
        }

        public final void setA3(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.A3 = dataBean;
        }

        public final PrinterModel.DataBean getX6h() {
            return PrintModelUtils.x6h;
        }

        public final void setX6h(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.x6h = dataBean;
        }

        public final PrinterModel.DataBean getU1() {
            return PrintModelUtils.U1;
        }

        public final void setU1(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.U1 = dataBean;
        }

        public final PrinterModel.DataBean getEA_LBLU1_WH() {
            return PrintModelUtils.EA_LBLU1_WH;
        }

        public final void setEA_LBLU1_WH(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.EA_LBLU1_WH = dataBean;
        }

        public final PrinterModel.DataBean getD100() {
            return PrintModelUtils.D100;
        }

        public final void setD100(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.D100 = dataBean;
        }

        public final PrinterModel.DataBean getMiniPrinter() {
            return PrintModelUtils.MiniPrinter;
        }

        public final void setMiniPrinter(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.MiniPrinter = dataBean;
        }

        public final PrinterModel.DataBean getLabel_Printer() {
            return PrintModelUtils.Label_Printer;
        }

        public final void setLabel_Printer(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.Label_Printer = dataBean;
        }

        public final PrinterModel.DataBean getShipping_Printer() {
            return PrintModelUtils.Shipping_Printer;
        }

        public final void setShipping_Printer(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.Shipping_Printer = dataBean;
        }

        public final PrinterModel.DataBean getShipping_Printer2() {
            return PrintModelUtils.Shipping_Printer2;
        }

        public final void setShipping_Printer2(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.Shipping_Printer2 = dataBean;
        }

        public final PrinterModel.DataBean getProfessional_Printer() {
            return PrintModelUtils.Professional_Printer;
        }

        public final void setProfessional_Printer(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.Professional_Printer = dataBean;
        }

        public final PrinterModel.DataBean getPR08() {
            return PrintModelUtils.PR08;
        }

        public final void setPR08(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.PR08 = dataBean;
        }

        public final PrinterModel.DataBean getS600() {
            return PrintModelUtils.S600;
        }

        public final void setS600(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.S600 = dataBean;
        }

        public final PrinterModel.DataBean getKS_1() {
            return PrintModelUtils.KS_1;
        }

        public final void setKS_1(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.KS_1 = dataBean;
        }

        public final PrinterModel.DataBean getDL_X7() {
            return PrintModelUtils.DL_X7;
        }

        public final void setDL_X7(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.DL_X7 = dataBean;
        }

        public final PrinterModel.DataBean getDL_X7Pro() {
            return PrintModelUtils.DL_X7Pro;
        }

        public final void setDL_X7Pro(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.DL_X7Pro = dataBean;
        }

        public final PrinterModel.DataBean getDL_X2() {
            return PrintModelUtils.DL_X2;
        }

        public final void setDL_X2(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.DL_X2 = dataBean;
        }

        public final PrinterModel.DataBean getDL_GE225() {
            return PrintModelUtils.DL_GE225;
        }

        public final void setDL_GE225(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.DL_GE225 = dataBean;
        }

        public final PrinterModel.DataBean getDL_X2Pro() {
            return PrintModelUtils.DL_X2Pro;
        }

        public final void setDL_X2Pro(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.DL_X2Pro = dataBean;
        }

        public final PrinterModel.DataBean getSeznikEcho() {
            return PrintModelUtils.SeznikEcho;
        }

        public final void setSeznikEcho(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.SeznikEcho = dataBean;
        }

        public final PrinterModel.DataBean getCameraPrint() {
            return PrintModelUtils.CameraPrint;
        }

        public final void setCameraPrint(PrinterModel.DataBean dataBean) {
            Intrinsics.checkNotNullParameter(dataBean, "<set-?>");
            PrintModelUtils.CameraPrint = dataBean;
        }

        public final String getData(String appName) {
            Intrinsics.checkNotNullParameter(appName, "appName");
            ArrayList<PrinterModel.DataBean> arrayList = new ArrayList<>();
            arrayList.add(getX5h());
            arrayList.add(getX5H());
            arrayList.add(getX6h());
            arrayList.add(getX6H());
            arrayList.add(getX7h());
            arrayList.add(getX7H());
            arrayList.add(getX2H());
            arrayList.add(getX2h());
            arrayList.add(getXw001());
            arrayList.add(getXw003());
            arrayList.add(getJx001());
            arrayList.add(getJxm008());
            arrayList.add(getM01());
            arrayList.add(getGb01());
            arrayList.add(getGb02());
            arrayList.add(getGb03());
            arrayList.add(getGb04());
            arrayList.add(getGb05());
            arrayList.add(getGb06());
            arrayList.add(getAn01());
            arrayList.add(getLy01());
            arrayList.add(getLy02());
            arrayList.add(getLy03());
            arrayList.add(getLy05());
            arrayList.add(getAi01());
            arrayList.add(getLy10());
            arrayList.add(getLy11());
            arrayList.add(getPr07());
            arrayList.add(getPr02());
            arrayList.add(getP10());
            arrayList.add(get_58p5());
            arrayList.add(getWL01());
            arrayList.add(getP5ai());
            arrayList.add(getX5());
            arrayList.add(getX7());
            arrayList.add(getS101());
            arrayList.add(getS102());
            arrayList.add(getX1());
            arrayList.add(getX8l());
            arrayList.add(getX8w());
            arrayList.add(getX8());
            arrayList.add(getX9());
            arrayList.add(getX6());
            arrayList.add(getS01());
            arrayList.add(getPr30());
            arrayList.add(getPr35());
            arrayList.add(getPr88());
            arrayList.add(getPr89());
            arrayList.add(getA42II());
            arrayList.add(getA41II());
            arrayList.add(getGt01());
            arrayList.add(getGt02());
            arrayList.add(getGt03());
            arrayList.add(getGt04());
            arrayList.add(getGt08());
            arrayList.add(getLt01());
            arrayList.add(getM2());
            PrinterModel printerModel = new PrinterModel();
            printerModel.setData(arrayList);
            String json = GsonUtils.toJson(printerModel);
            Intrinsics.checkNotNullExpressionValue(json, "toJson");
            return json;
        }

        public final ArrayList<PrinterModel.DataBean> getData_zhiwuya_b() {
            ArrayList<PrinterModel.DataBean> arrayList = new ArrayList<>();
            arrayList.add(getP20max());
            arrayList.add(getCLICK_PRINT());
            arrayList.add(getTRAiPrinter());
            arrayList.add(getTotori());
            arrayList.add(getVOICE_PRINT());
            arrayList.add(getEA_LBLU1_WH());
            arrayList.add(getMVMT_INK());
            arrayList.add(getMTPR26BK());
            arrayList.add(getKIDYPRINTER());
            arrayList.add(getCLICK_SOUND());
            arrayList.add(getAudioPrint());
            arrayList.add(getS5A());
            arrayList.add(getS9A());
            arrayList.add(getDY33A());
            arrayList.add(getDT1_R());
            arrayList.add(getYMS_BT01());
            arrayList.add(getMV_B530());
            arrayList.add(getWJ_HOT_PRT());
            arrayList.add(getL1());
            arrayList.add(getX18());
            arrayList.add(getRS9000());
            arrayList.add(getML_MP_01());
            arrayList.add(getQDID());
            arrayList.add(getLuxorp_PX10());
            arrayList.add(getEMX_040256());
            arrayList.add(getX1());
            arrayList.add(getDY49());
            arrayList.add(getXC9());
            arrayList.add(getDL_X2Pro());
            arrayList.add(getDL_X2());
            arrayList.add(getA4300());
            arrayList.add(getGW09());
            arrayList.add(getDTR_R0());
            arrayList.add(getPT001());
            arrayList.add(getFC02());
            arrayList.add(getGT10());
            arrayList.add(getCP01());
            arrayList.add(getIM_04());
            arrayList.add(getJRX01());
            arrayList.add(getQDX01());
            arrayList.add(getZP802());
            arrayList.add(getROSSMANN());
            arrayList.add(getSeznikNeo());
            arrayList.add(getSeznikEcho());
            arrayList.add(getX9());
            arrayList.add(getGL_VS9());
            arrayList.add(getX5h());
            arrayList.add(getX16());
            arrayList.add(getU1());
            arrayList.add(getX8w());
            arrayList.add(getX8l());
            arrayList.add(getLGM01());
            arrayList.add(getX7HP());
            arrayList.add(getSC03H());
            arrayList.add(getA43());
            arrayList.add(getPr891());
            arrayList.add(getZP801());
            arrayList.add(getMPA81());
            return arrayList;
        }

        public final String getData_zhiwuya() {
            ArrayList<PrinterModel.DataBean> arrayList = new ArrayList<>();
            arrayList.add(getP20max());
            arrayList.add(getCLICK_PRINT());
            arrayList.add(getTRAiPrinter());
            arrayList.add(getTotori());
            arrayList.add(getVOICE_PRINT());
            arrayList.add(getEA_LBLU1_WH());
            arrayList.add(getMVMT_INK());
            arrayList.add(getMTPR26BK());
            arrayList.add(getKIDYPRINTER());
            arrayList.add(getCLICK_SOUND());
            arrayList.add(getAudioPrint());
            arrayList.add(getS5A());
            arrayList.add(getS9A());
            arrayList.add(getDY33A());
            arrayList.add(getDT1_R());
            arrayList.add(getL1());
            arrayList.add(getMV_B530());
            arrayList.add(getFl01());
            arrayList.add(getX18());
            arrayList.add(getYMS_BT01());
            arrayList.add(getWJ_HOT_PRT());
            arrayList.add(getRS9000());
            arrayList.add(getML_MP_01());
            arrayList.add(getQDID());
            arrayList.add(getLuxorp_PX10());
            arrayList.add(getEMX_040256());
            arrayList.add(getGW09());
            arrayList.add(getPT001());
            arrayList.add(getWts07());
            arrayList.add(getSeznikNeo());
            arrayList.add(getSeznikEcho());
            arrayList.add(getZP801());
            arrayList.add(getSC03H());
            arrayList.add(getLGM01());
            arrayList.add(getMPA81());
            arrayList.add(getGL_VS9());
            arrayList.add(getA43());
            arrayList.add(getX16());
            arrayList.add(getU1());
            arrayList.add(getGW08());
            arrayList.add(getGT10());
            arrayList.add(getGT09());
            arrayList.add(getA33());
            arrayList.add(getGt08());
            arrayList.add(getPr893());
            arrayList.add(getZP802());
            arrayList.add(getA200());
            arrayList.add(getCP01());
            arrayList.add(getIM_04());
            arrayList.add(getJRX01());
            arrayList.add(getQDX01());
            arrayList.add(getP4());
            arrayList.add(getX5HP());
            arrayList.add(getX6HP());
            arrayList.add(getX7HP());
            arrayList.add(getX5h());
            arrayList.add(getROSSMANN());
            arrayList.add(getX5H());
            arrayList.add(getX6h());
            arrayList.add(getX6H());
            arrayList.add(getX7h());
            arrayList.add(getX7H());
            arrayList.add(getX2H());
            arrayList.add(getX2h());
            arrayList.add(getX100());
            arrayList.add(getHT0125());
            arrayList.add(getDT1_0());
            arrayList.add(getX101H());
            arrayList.add(getX102());
            arrayList.add(getX103H());
            arrayList.add(getX103h());
            arrayList.add(getRt034h());
            arrayList.add(get_0019B_C());
            arrayList.add(getUXPORTMIP());
            arrayList.add(getEwtto_ET_Z0504());
            arrayList.add(getPocket_Printer());
            arrayList.add(getIprintIt_Printer());
            arrayList.add(getTCM690464());
            arrayList.add(getXw001());
            arrayList.add(getXw003());
            arrayList.add(getJx001());
            arrayList.add(getJxm008());
            arrayList.add(getM01());
            arrayList.add(getAn01());
            arrayList.add(getLy01());
            arrayList.add(getLy02());
            arrayList.add(getLy03());
            arrayList.add(getLy05());
            arrayList.add(getAi01());
            arrayList.add(getLy10());
            arrayList.add(getLy11());
            arrayList.add(getPr07());
            arrayList.add(getPr02());
            arrayList.add(getP10());
            arrayList.add(get_58p5());
            arrayList.add(getWL01());
            arrayList.add(getP5ai());
            arrayList.add(getX5_n());
            arrayList.add(getX7_n());
            arrayList.add(getS101_n());
            arrayList.add(getS102_n());
            arrayList.add(getX1());
            arrayList.add(getX8l());
            arrayList.add(getX8w());
            arrayList.add(getX8());
            arrayList.add(getX9());
            arrayList.add(getX6_n());
            arrayList.add(getLP6());
            arrayList.add(getS01());
            arrayList.add(getPr30());
            arrayList.add(getPr35());
            arrayList.add(getPr88());
            arrayList.add(getPr891());
            arrayList.add(getZPA4Z1());
            arrayList.add(getLt01());
            arrayList.add(getM2());
            arrayList.add(getZHHC());
            PrinterModel printerModel = new PrinterModel();
            printerModel.setData(arrayList);
            String json = GsonUtils.toJson(printerModel);
            Intrinsics.checkNotNullExpressionValue(json, "toJson");
            return json;
        }

        public final ArrayList<PrinterModel.DataBean> getData_jzxx_b() {
            ArrayList<PrinterModel.DataBean> arrayList = new ArrayList<>();
            arrayList.add(getAiPrintT1());
            arrayList.add(getAiPrint());
            arrayList.add(getPR08());
            arrayList.add(getS600());
            arrayList.add(getKS_1());
            arrayList.add(getAudioPrint());
            arrayList.add(getS5A());
            arrayList.add(getS9A());
            arrayList.add(getDY33A());
            arrayList.add(getWQ02());
            arrayList.add(getYMS_BT01());
            arrayList.add(getWJ_HOT_PRT());
            arrayList.add(getRS9000());
            arrayList.add(getL1());
            arrayList.add(getML_MP_01());
            arrayList.add(getKF_5());
            arrayList.add(getX1());
            arrayList.add(getD1());
            arrayList.add(getLabel_Printer());
            arrayList.add(getShipping_Printer());
            arrayList.add(getProfessional_Printer());
            arrayList.add(getMiniPrinter());
            arrayList.add(getP5());
            arrayList.add(getYK_06());
            arrayList.add(getDY49());
            arrayList.add(getXC9());
            arrayList.add(getDL_X2Pro());
            arrayList.add(getDL_X2());
            arrayList.add(getFl01());
            arrayList.add(getA4300());
            arrayList.add(getGW09());
            arrayList.add(getDTR_R0());
            arrayList.add(getDL_X7());
            arrayList.add(getD100());
            arrayList.add(getPT001());
            arrayList.add(getFC02());
            arrayList.add(getX16());
            arrayList.add(getU1());
            arrayList.add(get_15P3());
            arrayList.add(getA43());
            arrayList.add(getGL_VS9());
            arrayList.add(getPr891());
            arrayList.add(getZP801());
            arrayList.add(getZP802());
            arrayList.add(getMPA81());
            arrayList.add(getGT10());
            arrayList.add(getCP01());
            arrayList.add(getIM_04());
            arrayList.add(getJRX01());
            arrayList.add(getQDX01());
            arrayList.add(getROSSMANN());
            arrayList.add(getX5h());
            arrayList.add(getLGM01());
            arrayList.add(getGW08());
            arrayList.add(getX8w());
            arrayList.add(getX8l());
            return arrayList;
        }

        public final String getData_jzxx() {
            ArrayList<PrinterModel.DataBean> arrayList = new ArrayList<>();
            arrayList.add(getAiPrintT1());
            arrayList.add(getAiPrint());
            arrayList.add(getA2());
            arrayList.add(getA3());
            arrayList.add(getPR08());
            arrayList.add(getS600());
            arrayList.add(getKS_1());
            arrayList.add(getAudioPrint());
            arrayList.add(getP20max());
            arrayList.add(getS5A());
            arrayList.add(getS9A());
            arrayList.add(getDY33A());
            arrayList.add(getWQ02());
            arrayList.add(getProfessional_Printer());
            arrayList.add(getX18());
            arrayList.add(getYMS_BT01());
            arrayList.add(getWJ_HOT_PRT());
            arrayList.add(getRS9000());
            arrayList.add(getML_MP_01());
            arrayList.add(getKF_5());
            arrayList.add(getD1());
            arrayList.add(getFl01());
            arrayList.add(getGW09());
            arrayList.add(getPT001());
            arrayList.add(getWts07());
            arrayList.add(get_15P3());
            arrayList.add(getGL_VS9());
            arrayList.add(getMPA81());
            arrayList.add(getX16());
            arrayList.add(getU1());
            arrayList.add(getDY03());
            arrayList.add(getGW08());
            arrayList.add(getGT10());
            arrayList.add(getGT09());
            arrayList.add(getPr893());
            arrayList.add(getZP802());
            arrayList.add(getA41III());
            arrayList.add(getA200());
            arrayList.add(getX100());
            arrayList.add(getIM_04());
            arrayList.add(getCP01());
            arrayList.add(getJRX01());
            arrayList.add(getQDX01());
            arrayList.add(getP4());
            arrayList.add(getX5HP());
            arrayList.add(getX6HP());
            arrayList.add(getX7HP());
            arrayList.add(getROSSMANN());
            arrayList.add(getX5h());
            arrayList.add(getX5H());
            arrayList.add(getX6H());
            arrayList.add(getX7h());
            arrayList.add(getX7H());
            arrayList.add(getX2H());
            arrayList.add(getX2h());
            arrayList.add(getP7H());
            arrayList.add(getP6());
            arrayList.add(getX102());
            arrayList.add(getSC03H());
            arrayList.add(getX103H());
            arrayList.add(getX103h());
            arrayList.add(getSc03h());
            arrayList.add(getSc04h());
            arrayList.add(getLGM01());
            arrayList.add(getA43());
            arrayList.add(getP2());
            arrayList.add(getSc05());
            arrayList.add(getSc03());
            arrayList.add(getSc04());
            arrayList.add(getRt034h());
            arrayList.add(getUXPORTMIP());
            arrayList.add(getEwtto_ET_Z0504());
            arrayList.add(getA33());
            arrayList.add(getGB03SL());
            arrayList.add(getGB03SH());
            arrayList.add(getGB03PL());
            arrayList.add(getGB03PH());
            arrayList.add(getGB02SH());
            arrayList.add(getXw001());
            arrayList.add(getXw003());
            arrayList.add(getJx001());
            arrayList.add(getJxm008());
            arrayList.add(getM01());
            arrayList.add(getGb01());
            arrayList.add(getGb02());
            arrayList.add(getGb03_n());
            arrayList.add(getCMT_0510());
            arrayList.add(getGV_MA211());
            arrayList.add(getSc04());
            arrayList.add(getGb04());
            arrayList.add(getGb05());
            arrayList.add(getGb06_n());
            arrayList.add(getAn01());
            arrayList.add(getLy01());
            arrayList.add(getLy02());
            arrayList.add(getLy03());
            arrayList.add(getLy05());
            arrayList.add(getAi01());
            arrayList.add(getLy10());
            arrayList.add(getLy11());
            arrayList.add(getPr07());
            arrayList.add(getPr02());
            arrayList.add(getP10());
            arrayList.add(getP1());
            arrayList.add(get_58p5());
            arrayList.add(getWL01());
            arrayList.add(getP5ai());
            arrayList.add(getX5_n());
            arrayList.add(getX7_n());
            arrayList.add(getS101_n());
            arrayList.add(getS102_n());
            arrayList.add(getX1());
            arrayList.add(getHD1());
            arrayList.add(getX8l());
            arrayList.add(getX8w());
            arrayList.add(getX8());
            arrayList.add(getX9());
            arrayList.add(getX6_n());
            arrayList.add(getIprintIt_Printer());
            arrayList.add(getLP6());
            arrayList.add(getS01());
            arrayList.add(getPr30());
            arrayList.add(getPr35());
            arrayList.add(getPr88());
            arrayList.add(getPr891());
            arrayList.add(getZP801());
            arrayList.add(getZPA4Z1());
            arrayList.add(getA42II());
            arrayList.add(getA41II());
            arrayList.add(getGt01());
            arrayList.add(getGt02());
            arrayList.add(getGt03());
            arrayList.add(getGt04());
            arrayList.add(getGt08());
            arrayList.add(getLt01());
            arrayList.add(getM2());
            arrayList.add(getZHHC());
            arrayList.add(getDy01());
            arrayList.add(getP7());
            PrinterModel printerModel = new PrinterModel();
            printerModel.setData(arrayList);
            String json = GsonUtils.toJson(printerModel);
            Intrinsics.checkNotNullExpressionValue(json, "toJson");
            return json;
        }

        public final ArrayList<PrinterModel.DataBean> getData_iPrint_b() {
            ArrayList<PrinterModel.DataBean> arrayList = new ArrayList<>();
            arrayList.add(getAiPrintT1());
            arrayList.add(getAiPrint());
            arrayList.add(getPR08());
            arrayList.add(getS600());
            arrayList.add(getKS_1());
            arrayList.add(getA2());
            arrayList.add(getA3());
            arrayList.add(getP20max());
            arrayList.add(getTD11308());
            arrayList.add(getAudioPrint());
            arrayList.add(getS5A());
            arrayList.add(getS9A());
            arrayList.add(getDY33A());
            arrayList.add(getWQ02());
            arrayList.add(getWJ_HOT_PRT());
            arrayList.add(getYMS_BT01());
            arrayList.add(getL1());
            arrayList.add(getMV_B530());
            arrayList.add(getRS9000());
            arrayList.add(getML_MP_01());
            arrayList.add(get_0019B_D());
            arrayList.add(get_0019B_C());
            arrayList.add(getKF_5());
            arrayList.add(getX1());
            arrayList.add(getD1());
            arrayList.add(getLabel_Printer());
            arrayList.add(getShipping_Printer());
            arrayList.add(getProfessional_Printer());
            arrayList.add(getMiniPrinter());
            arrayList.add(getX6h());
            arrayList.add(getP5());
            arrayList.add(getYK_06());
            arrayList.add(getDY49());
            arrayList.add(getXC9());
            arrayList.add(getDL_X2Pro());
            arrayList.add(getDL_X2());
            arrayList.add(getFl01());
            arrayList.add(getA4300());
            arrayList.add(getGW09());
            arrayList.add(getDTR_R0());
            arrayList.add(getDL_X7());
            arrayList.add(getD100());
            arrayList.add(getPT001());
            arrayList.add(getFC02());
            arrayList.add(getGT10());
            arrayList.add(getA43());
            arrayList.add(getPr891());
            arrayList.add(getZP801());
            arrayList.add(getZP802());
            arrayList.add(getMPA81());
            arrayList.add(getX16());
            arrayList.add(getU1());
            arrayList.add(getGL_VS9());
            arrayList.add(getCP01());
            arrayList.add(getIM_04());
            arrayList.add(getJRX01());
            arrayList.add(getQDX01());
            arrayList.add(getROSSMANN());
            arrayList.add(getX5h());
            arrayList.add(getLGM01());
            arrayList.add(getGW08());
            arrayList.add(getX8w());
            arrayList.add(getX8l());
            return arrayList;
        }

        public final String getData_iPrint() {
            ArrayList<PrinterModel.DataBean> arrayList = new ArrayList<>();
            arrayList.add(getAiPrint());
            arrayList.add(getPR08());
            arrayList.add(getS600());
            arrayList.add(getKS_1());
            arrayList.add(getA2());
            arrayList.add(getA3());
            arrayList.add(getP20max());
            arrayList.add(getTD11308());
            arrayList.add(getAudioPrint());
            arrayList.add(getS5A());
            arrayList.add(getS9A());
            arrayList.add(getDY33A());
            arrayList.add(getWQ02());
            arrayList.add(getMV_B530());
            arrayList.add(getYMS_BT01());
            arrayList.add(getWJ_HOT_PRT());
            arrayList.add(getLabel_Printer());
            arrayList.add(getRS9000());
            arrayList.add(getML_MP_01());
            arrayList.add(get_0019B_D());
            arrayList.add(get_0019B_C());
            arrayList.add(getKF_5());
            arrayList.add(getD1());
            arrayList.add(getYK_06());
            arrayList.add(getX6h());
            arrayList.add(getFl01());
            arrayList.add(getA4300());
            arrayList.add(getPT001());
            arrayList.add(getWts07());
            arrayList.add(getGL_VS9());
            arrayList.add(getX16());
            arrayList.add(getU1());
            arrayList.add(get_15P3());
            arrayList.add(getMPA81());
            arrayList.add(getDY03());
            arrayList.add(getPr891());
            arrayList.add(getGW09());
            arrayList.add(getGW08());
            arrayList.add(getGT10());
            arrayList.add(getGT09());
            arrayList.add(getPr893());
            arrayList.add(getA41III());
            arrayList.add(getZP802());
            arrayList.add(getA200());
            arrayList.add(getIM_04());
            arrayList.add(getCP01());
            arrayList.add(getJRX01());
            arrayList.add(getQDX01());
            arrayList.add(getP4());
            arrayList.add(getX5HP());
            arrayList.add(getX6HP());
            arrayList.add(getX7HP());
            arrayList.add(getROSSMANN());
            arrayList.add(getX5h());
            arrayList.add(getX5H());
            arrayList.add(getX6H());
            arrayList.add(getX7h());
            arrayList.add(getX7H());
            arrayList.add(getX2H());
            arrayList.add(getX2h());
            arrayList.add(getP7H());
            arrayList.add(getP6());
            arrayList.add(getA43());
            arrayList.add(getSC03H());
            arrayList.add(getX103H());
            arrayList.add(getX103h());
            arrayList.add(getSc03h());
            arrayList.add(getSc04h());
            arrayList.add(getLGM01());
            arrayList.add(getP2());
            arrayList.add(getSc05());
            arrayList.add(getRt034h());
            arrayList.add(getUXPORTMIP());
            arrayList.add(getEwtto_ET_Z0504());
            arrayList.add(getA33());
            arrayList.add(getGB03SL());
            arrayList.add(getGB03SH());
            arrayList.add(getGB03PL());
            arrayList.add(getGB03PH());
            arrayList.add(getGB02SH());
            arrayList.add(getXw001());
            arrayList.add(getXw003());
            arrayList.add(getJx001());
            arrayList.add(getJxm008());
            arrayList.add(getM01());
            arrayList.add(getSc04());
            arrayList.add(getGb01());
            arrayList.add(getGb02());
            arrayList.add(getGb03_n());
            arrayList.add(getCMT_0510());
            arrayList.add(getGV_MA211());
            arrayList.add(getSc03());
            arrayList.add(getGb04());
            arrayList.add(getGb05());
            arrayList.add(getGb06_n());
            arrayList.add(getAn01());
            arrayList.add(getLy01());
            arrayList.add(getLy02());
            arrayList.add(getLy03());
            arrayList.add(getLy05());
            arrayList.add(getAi01());
            arrayList.add(getLy10());
            arrayList.add(getLy11());
            arrayList.add(getPr07());
            arrayList.add(getPr02());
            arrayList.add(getP10());
            arrayList.add(getP1());
            arrayList.add(get_58p5());
            arrayList.add(getWL01());
            arrayList.add(getP5ai());
            arrayList.add(getX5_n());
            arrayList.add(getX7_n());
            arrayList.add(getS101_n());
            arrayList.add(getS102_n());
            arrayList.add(getX1());
            arrayList.add(getX8l());
            arrayList.add(getX8w());
            arrayList.add(getX8());
            arrayList.add(getX9());
            arrayList.add(getX6_n());
            arrayList.add(getIprintIt_Printer());
            arrayList.add(getLP6());
            arrayList.add(getS01());
            arrayList.add(getPr30());
            arrayList.add(getPr35());
            arrayList.add(getPr88());
            arrayList.add(getPr89());
            arrayList.add(getZP801());
            arrayList.add(getZPA4Z1());
            arrayList.add(getA42II());
            arrayList.add(getA41II());
            arrayList.add(getGt01());
            arrayList.add(getGt02());
            arrayList.add(getGt03());
            arrayList.add(getGt04());
            arrayList.add(getGt08());
            arrayList.add(getLt01());
            arrayList.add(getM2());
            arrayList.add(getZHHC());
            arrayList.add(getDy01());
            arrayList.add(getP7());
            PrinterModel printerModel = new PrinterModel();
            printerModel.setData(arrayList);
            String json = GsonUtils.toJson(printerModel);
            Intrinsics.checkNotNullExpressionValue(json, "toJson");
            return json;
        }

        public final ArrayList<PrinterModel.DataBean> getData_tinyPrint_b() {
            ArrayList<PrinterModel.DataBean> arrayList = new ArrayList<>();
            arrayList.add(getCLICK_PRINT());
            arrayList.add(getTRAiPrinter());
            arrayList.add(getTotori());
            arrayList.add(getVOICE_PRINT());
            arrayList.add(getEA_LBLU1_WH());
            arrayList.add(getMVMT_INK());
            arrayList.add(getMTPR26BK());
            arrayList.add(getKIDYPRINTER());
            arrayList.add(getLISCIANI());
            arrayList.add(getCLICK_SOUND());
            arrayList.add(getA2());
            arrayList.add(getA3());
            arrayList.add(getP20max());
            arrayList.add(getTD11308());
            arrayList.add(getAudioPrint());
            arrayList.add(getS5A());
            arrayList.add(getS9A());
            arrayList.add(getDY33A());
            arrayList.add(getDT1_R());
            arrayList.add(getU2());
            arrayList.add(getWJ_HOT_PRT());
            arrayList.add(getL1());
            arrayList.add(getX18());
            arrayList.add(getMV_B530());
            arrayList.add(getRS9000());
            arrayList.add(getML_MP_01());
            arrayList.add(getQDID());
            arrayList.add(get_0019B_D());
            arrayList.add(get_0019B_C());
            arrayList.add(getLuxorp_PX10());
            arrayList.add(getEMX_040256());
            arrayList.add(getX1());
            arrayList.add(getDY49());
            arrayList.add(getXC9());
            arrayList.add(getDL_X2Pro());
            arrayList.add(getDL_X2());
            arrayList.add(getGW09());
            arrayList.add(getDTR_R0());
            arrayList.add(getPT001());
            arrayList.add(getP1());
            arrayList.add(getFC02());
            arrayList.add(getX16());
            arrayList.add(getU1());
            arrayList.add(getA43());
            arrayList.add(getPr891());
            arrayList.add(getGL_VS9());
            arrayList.add(getZP801());
            arrayList.add(getMPA81());
            arrayList.add(getGT10());
            arrayList.add(getCP01());
            arrayList.add(getSeznikNeo());
            arrayList.add(getSeznikEcho());
            arrayList.add(getIM_04());
            arrayList.add(getJRX01());
            arrayList.add(getQDX01());
            arrayList.add(getROSSMANN());
            arrayList.add(getZP802());
            arrayList.add(getX9());
            arrayList.add(getX5h());
            arrayList.add(getLGM01());
            arrayList.add(getX7HP());
            arrayList.add(getSC03H());
            arrayList.add(getX8w());
            arrayList.add(getX8l());
            return arrayList;
        }

        public final String getData_tinyPrint() {
            ArrayList<PrinterModel.DataBean> arrayList = new ArrayList<>();
            arrayList.add(getCLICK_PRINT());
            arrayList.add(getTRAiPrinter());
            arrayList.add(getTotori());
            arrayList.add(getVOICE_PRINT());
            arrayList.add(getEA_LBLU1_WH());
            arrayList.add(getMVMT_INK());
            arrayList.add(getMTPR26BK());
            arrayList.add(getKIDYPRINTER());
            arrayList.add(getLISCIANI());
            arrayList.add(getCLICK_SOUND());
            arrayList.add(getA2());
            arrayList.add(getA3());
            arrayList.add(getP20max());
            arrayList.add(getTD11308());
            arrayList.add(getAudioPrint());
            arrayList.add(getS5A());
            arrayList.add(getS9A());
            arrayList.add(getDY33A());
            arrayList.add(getDT1_R());
            arrayList.add(getU2());
            arrayList.add(getXC9_FL01());
            arrayList.add(getWJ_HOT_PRT());
            arrayList.add(getLabel_Printer());
            arrayList.add(getMV_B530());
            arrayList.add(getRS9000());
            arrayList.add(getML_MP_01());
            arrayList.add(getQDID());
            arrayList.add(get_0019B_D());
            arrayList.add(get_0019B_C());
            arrayList.add(getLuxorp_PX10());
            arrayList.add(getEMX_040256());
            arrayList.add(getGW09());
            arrayList.add(getPT001());
            arrayList.add(get_15P3());
            arrayList.add(getWts07());
            arrayList.add(getGL_VS9());
            arrayList.add(getMPA81());
            arrayList.add(getZP801());
            arrayList.add(getLGM01());
            arrayList.add(getSC03H());
            arrayList.add(getX16());
            arrayList.add(getU1());
            arrayList.add(getSeznikNeo());
            arrayList.add(getSeznikEcho());
            arrayList.add(getGW08());
            arrayList.add(getGT10());
            arrayList.add(getGT09());
            arrayList.add(getPr893());
            arrayList.add(getZP802());
            arrayList.add(getA33());
            arrayList.add(getA200());
            arrayList.add(getIM_04());
            arrayList.add(getS5());
            arrayList.add(getCP01());
            arrayList.add(getJRX01());
            arrayList.add(getQDX01());
            arrayList.add(getP4());
            arrayList.add(getX5HP());
            arrayList.add(getX6HP());
            arrayList.add(getX7HP());
            arrayList.add(getROSSMANN());
            arrayList.add(getX5h());
            arrayList.add(getX5H());
            arrayList.add(getX6h());
            arrayList.add(getX6H());
            arrayList.add(getX7h());
            arrayList.add(getX7H());
            arrayList.add(getX2H());
            arrayList.add(getX2h());
            arrayList.add(getA43());
            arrayList.add(getHT0125());
            arrayList.add(getDT1_0());
            arrayList.add(getX100());
            arrayList.add(getX101H());
            arrayList.add(getX102());
            arrayList.add(getX103H());
            arrayList.add(getX103h());
            arrayList.add(getRt034h());
            arrayList.add(get_0019B_C());
            arrayList.add(getUXPORTMIP());
            arrayList.add(getEwtto_ET_Z0504());
            arrayList.add(getPocket_Printer());
            arrayList.add(getTCM690464());
            arrayList.add(getXw001());
            arrayList.add(getXw003());
            arrayList.add(getJx001());
            arrayList.add(getJxm008());
            arrayList.add(getM01());
            arrayList.add(getAn01());
            arrayList.add(getLy01());
            arrayList.add(getLy02());
            arrayList.add(getLy03());
            arrayList.add(getLy05());
            arrayList.add(getAi01());
            arrayList.add(getLy10());
            arrayList.add(getLy11());
            arrayList.add(getPr07());
            arrayList.add(getPr02());
            arrayList.add(getP10());
            arrayList.add(get_58p5());
            arrayList.add(getWL01());
            arrayList.add(getP5ai());
            arrayList.add(getX5_n());
            arrayList.add(getX7_n());
            arrayList.add(getS101_n());
            arrayList.add(getS102_n());
            arrayList.add(getX1());
            arrayList.add(getX8l());
            arrayList.add(getX8w());
            arrayList.add(getX8());
            arrayList.add(getX9());
            arrayList.add(getGt08());
            arrayList.add(getX6_n());
            arrayList.add(getIprintIt_Printer());
            arrayList.add(getLP6());
            arrayList.add(getS01());
            arrayList.add(getPr30());
            arrayList.add(getPr35());
            arrayList.add(getPr88());
            arrayList.add(getPr891());
            arrayList.add(getZPA4Z1());
            arrayList.add(getLt01());
            arrayList.add(getM2());
            arrayList.add(getZHHC());
            PrinterModel printerModel = new PrinterModel();
            printerModel.setData(arrayList);
            String json = GsonUtils.toJson(printerModel);
            Intrinsics.checkNotNullExpressionValue(json, "toJson");
            return json;
        }

        public final String getFreeTattoo() {
            ArrayList<PrinterModel.DataBean> arrayList = new ArrayList<>();
            arrayList.add(getA41II());
            arrayList.add(getA42II());
            arrayList.add(getGt08());
            arrayList.add(getX9());
            arrayList.add(getPr891());
            arrayList.add(getA43());
            PrinterModel printerModel = new PrinterModel();
            printerModel.setData(arrayList);
            String json = GsonUtils.toJson(printerModel);
            Intrinsics.checkNotNullExpressionValue(json, "toJson");
            return json;
        }

        public final String getGelin() {
            ArrayList<PrinterModel.DataBean> arrayList = new ArrayList<>();
            arrayList.add(getGb03());
            arrayList.add(getGb06());
            arrayList.add(getS101());
            PrinterModel printerModel = new PrinterModel();
            printerModel.setData(arrayList);
            String json = GsonUtils.toJson(printerModel);
            Intrinsics.checkNotNullExpressionValue(json, "toJson");
            return json;
        }

        public final String getYiYiTong() {
            ArrayList<PrinterModel.DataBean> arrayList = new ArrayList<>();
            arrayList.add(getGb01());
            arrayList.add(getGb02());
            arrayList.add(getGb03());
            arrayList.add(getGb04());
            arrayList.add(getGb05());
            arrayList.add(getGb06());
            arrayList.add(getGt01());
            arrayList.add(getGt02());
            arrayList.add(getS101());
            arrayList.add(getX5());
            PrinterModel printerModel = new PrinterModel();
            printerModel.setData(arrayList);
            String json = GsonUtils.toJson(printerModel);
            Intrinsics.checkNotNullExpressionValue(json, "toJson");
            return json;
        }

        public final String getBole() {
            ArrayList<PrinterModel.DataBean> arrayList = new ArrayList<>();
            arrayList.add(getS101());
            PrinterModel printerModel = new PrinterModel();
            printerModel.setData(arrayList);
            String json = GsonUtils.toJson(printerModel);
            Intrinsics.checkNotNullExpressionValue(json, "toJson");
            return json;
        }

        public final String getShuanghou() {
            ArrayList<PrinterModel.DataBean> arrayList = new ArrayList<>();
            arrayList.add(getGb03());
            PrinterModel printerModel = new PrinterModel();
            printerModel.setData(arrayList);
            String json = GsonUtils.toJson(printerModel);
            Intrinsics.checkNotNullExpressionValue(json, "toJson");
            return json;
        }

        public final String getDeLi() {
            ArrayList<PrinterModel.DataBean> arrayList = new ArrayList<>();
            arrayList.add(getDL_X7());
            arrayList.add(getDL_X7Pro());
            arrayList.add(getDL_X2());
            arrayList.add(getDL_X2Pro());
            PrinterModel printerModel = new PrinterModel();
            printerModel.setData(arrayList);
            String json = GsonUtils.toJson(printerModel);
            Intrinsics.checkNotNullExpressionValue(json, "toJson");
            return json;
        }

        public final String getCorePrint() {
            ArrayList<PrinterModel.DataBean> arrayList = new ArrayList<>();
            arrayList.add(getS600());
            arrayList.add(getAiPrint());
            arrayList.add(getLabel_Printer());
            arrayList.add(getShipping_Printer());
            arrayList.add(getShipping_Printer2());
            arrayList.add(getProfessional_Printer());
            arrayList.add(getMiniPrinter());
            arrayList.add(getX6h());
            PrinterModel printerModel = new PrinterModel();
            printerModel.setData(arrayList);
            String json = GsonUtils.toJson(printerModel);
            Intrinsics.checkNotNullExpressionValue(json, "toJson");
            return json;
        }

        public final String getPrintCamera() {
            ArrayList<PrinterModel.DataBean> arrayList = new ArrayList<>();
            arrayList.add(getCameraPrint());
            PrinterModel printerModel = new PrinterModel();
            printerModel.setData(arrayList);
            String json = GsonUtils.toJson(printerModel);
            Intrinsics.checkNotNullExpressionValue(json, "toJson");
            return json;
        }

        public final String getSDK() {
            ArrayList<PrinterModel.DataBean> arrayList = new ArrayList<>();
            arrayList.add(getProfessional_Printer());
            arrayList.add(getX9());
            PrinterModel printerModel = new PrinterModel();
            printerModel.setData(arrayList);
            String json = GsonUtils.toJson(printerModel);
            Intrinsics.checkNotNullExpressionValue(json, "toJson");
            return json;
        }

        public final ArrayList<PrinterModel.DataBean> getYiFeng() {
            ArrayList<PrinterModel.DataBean> arrayList = new ArrayList<>();
            arrayList.add(getAudioPrint());
            return arrayList;
        }
    }

    public final String getJLF() {
        ArrayList<PrinterModel.DataBean> arrayList = new ArrayList<>();
        arrayList.add(gb01);
        arrayList.add(gb02);
        arrayList.add(gb03);
        arrayList.add(gb04);
        arrayList.add(gb05);
        arrayList.add(gb06);
        arrayList.add(gt01);
        arrayList.add(gt02);
        arrayList.add(s101);
        arrayList.add(x5);
        PrinterModel printerModel = new PrinterModel();
        printerModel.setData(arrayList);
        String json = GsonUtils.toJson(printerModel);
        Intrinsics.checkNotNullExpressionValue(json, "toJson");
        return json;
    }
}
