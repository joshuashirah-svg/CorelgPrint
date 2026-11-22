package com.lib.blueUtils;

import com.Utils.PrintModelUtils;
import com.Utils.PrinterModel;
import com.blankj.utilcode.util.GsonUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.StringUtils;
import com.google.android.material.internal.ViewUtils;
import com.lib.Utils.Code;
import com.lib.Utils.DeviceUtils;
import com.lib.Utils.SpecialPhoneMtu;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class PrinterModelUtils {
    private static String json = "";
    public static ArrayList<PrinterModel.DataBean> modelList = new ArrayList<>();
    private static PrinterModel printerModel;

    public static PrinterModel.DataBean getPrinterModel() {
        try {
            return getPrinterModel(SPUtils.getInstance().getString(Code.DEVICETYPE));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static void getModelList() {
        ArrayList<PrinterModel.DataBean> data;
        String data_jzxx;
        String string = SPUtils.getInstance().getString(Code.DEVINFOJSON, "");
        json = string;
        if (StringUtils.isEmpty(string)) {
            data = new ArrayList<>();
        } else {
            PrinterModel printerModel2 = (PrinterModel) GsonUtils.fromJson(json, PrinterModel.class);
            printerModel = printerModel2;
            data = printerModel2.getData();
        }
        if (data == null) {
            data = new ArrayList<>();
        }
        if (Code.iPrint.equals(SPUtils.getInstance().getString(Code.appInfo))) {
            data_jzxx = PrintModelUtils.INSTANCE.getData_iPrint();
        } else if (Code.tinyPrint.equals(SPUtils.getInstance().getString(Code.appInfo))) {
            data_jzxx = PrintModelUtils.INSTANCE.getData_tinyPrint();
        } else if (Code.zhiwuya.equals(Code.appInfo())) {
            data_jzxx = PrintModelUtils.INSTANCE.getData_zhiwuya();
        } else if (Code.CorePrint.equals(Code.appInfo())) {
            data_jzxx = PrintModelUtils.INSTANCE.getCorePrint();
        } else {
            data_jzxx = PrintModelUtils.INSTANCE.getData_jzxx();
        }
        for (PrinterModel.DataBean dataBean : ((PrinterModel) GsonUtils.fromJson(data_jzxx, PrinterModel.class)).getData()) {
            Iterator<PrinterModel.DataBean> it = data.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (dataBean.getModelNo().equals(it.next().getModelNo())) {
                        break;
                    }
                } else {
                    data.add(dataBean);
                    break;
                }
            }
        }
        modelList = data;
        LogUtils.e("getModelList", Integer.valueOf(data.size()));
    }

    public static PrinterModel.DataBean getPrinterModel(String str) {
        try {
            if (StringUtils.isEmpty(str)) {
                return PrinterModel.getModel("");
            }
            if (modelList.size() == 0) {
                getModelList();
            }
            PrinterModel.DataBean dataBean = null;
            for (PrinterModel.DataBean dataBean2 : modelList) {
                if (str.startsWith(dataBean2.getModelNo()) && (dataBean == null || dataBean.getModelNo().length() < dataBean2.getModelNo().length())) {
                    dataBean = dataBean2;
                }
            }
            return dataBean == null ? PrinterModel.getModel("") : dataBean;
        } catch (NullPointerException e) {
            LogUtils.e("getPrinterModel——e", e.getMessage());
            return PrinterModel.getModel("");
        }
    }

    public static int getPrintSize() {
        try {
            PrinterModel.DataBean printerModel2 = getPrinterModel(SPUtils.getInstance().getString(Code.DEVICETYPE));
            if (showPaperWidth(printerModel2)) {
                String string = SPUtils.getInstance().getString(Code.paperWidth);
                if (!StringUtils.isEmpty(string) && !Code.m210.equals(string)) {
                    if (Code.m113.equals(string)) {
                        return ViewUtils.EDGE_TO_EDGE_FLAGS;
                    }
                    if (Code.m79.equals(string)) {
                        return 576;
                    }
                    if (Code.m57.equals(string)) {
                        return 384;
                    }
                }
                return printerModel2.getPaperSize();
            }
            return printerModel2.getPaperSize();
        } catch (NullPointerException unused) {
            return 384;
        }
    }

    public static int getPrintImgSize() {
        try {
            PrinterModel.DataBean printerModel2 = getPrinterModel(SPUtils.getInstance().getString(Code.DEVICETYPE));
            if (!DeviceUtils.addMorPix(printerModel2.getModelNo())) {
                return printerModel2.getPrintSize();
            }
            return printerModel2.getPaperSize();
        } catch (NullPointerException unused) {
            return 384;
        }
    }

    public static int getImgPrintSpeed() {
        try {
            PrinterModel.DataBean printerModel2 = getPrinterModel(SPUtils.getInstance().getString(Code.DEVICETYPE));
            if (printerModel2.getModelNo().equals("GB01") && SpecialPhoneMtu.createSpecialPhoneMtu().getImgSpeed() != 0) {
                return SpecialPhoneMtu.createSpecialPhoneMtu().getImgSpeed();
            }
            if (Code.OFFICE_PRINT.equals(SPUtils.getInstance().getString(Code.ACTIVITY_NAME))) {
                return printerModel2.getTextPrintSpeed();
            }
            return printerModel2.getImgPrintSpeed();
        } catch (NullPointerException unused) {
            return 20;
        }
    }

    public static int getTextPrintSpeed() {
        try {
            PrinterModel.DataBean printerModel2 = getPrinterModel(SPUtils.getInstance().getString(Code.DEVICETYPE));
            if (printerModel2.getModelNo().equals("GB01") && SpecialPhoneMtu.createSpecialPhoneMtu().getImgSpeed() != 0) {
                return SpecialPhoneMtu.createSpecialPhoneMtu().getTextSpeed();
            }
            return printerModel2.getTextPrintSpeed();
        } catch (NullPointerException unused) {
            return 20;
        }
    }

    public static int getTattooSpeed() {
        try {
            PrinterModel.DataBean printerModel2 = getPrinterModel(SPUtils.getInstance().getString(Code.DEVICETYPE));
            if (printerModel2.isTattooPaper()) {
                return printerModel2.getTattooSpeed();
            }
            return printerModel2.getImgPrintSpeed();
        } catch (NullPointerException unused) {
            return 20;
        }
    }

    public static int getPrinterMtu() {
        try {
            PrinterModel.DataBean printerModel2 = getPrinterModel(SPUtils.getInstance().getString(Code.DEVICETYPE));
            if (printerModel2.getModelNo().equals("GB01") && SpecialPhoneMtu.createSpecialPhoneMtu().getMTU() != 0) {
                return SpecialPhoneMtu.createSpecialPhoneMtu().getMTU();
            }
            return printerModel2.getImgMTU();
        } catch (NullPointerException unused) {
            return 0;
        }
    }

    public static boolean showAiPainting() {
        PrinterModel.DataBean printerModel2 = getPrinterModel(SPUtils.getInstance().getString(Code.DEVICETYPE));
        String string = SPUtils.getInstance().getString(Code.showAiPaintingDev, "0019B-C");
        if (StringUtils.isEmpty(string) || StringUtils.isEmpty(printerModel2.getModelNo())) {
            return false;
        }
        return string.contains(printerModel2.getModelNo());
    }

    public static boolean showPaperWidth() {
        return showPaperWidth(getPrinterModel(SPUtils.getInstance().getString(Code.DEVICETYPE)));
    }

    public static boolean showPaperWidth(PrinterModel.DataBean dataBean) {
        String string = SPUtils.getInstance().getString(Code.changePaperWidth, "GT08,A42II,A41II,GT09,X9,A43,P4");
        if (StringUtils.isEmpty(string) || StringUtils.isEmpty(dataBean.getModelNo())) {
            return false;
        }
        return string.contains(dataBean.getModelNo());
    }

    public static boolean checkPrintStatus(PrinterModel.DataBean dataBean) {
        String string = SPUtils.getInstance().getString(Code.PrintCamera, "XiaoWa,CP01,JRX01,QDX01");
        if (StringUtils.isEmpty(string) || StringUtils.isEmpty(dataBean.getModelNo())) {
            return false;
        }
        return string.contains(dataBean.getModelNo());
    }

    public static boolean checkPrintStatus(String str) {
        String string = SPUtils.getInstance().getString(Code.PrintCamera, "XiaoWa,CP01,JRX01,QDX01");
        if (StringUtils.isEmpty(string) || StringUtils.isEmpty(str)) {
            return false;
        }
        return string.contains(str);
    }

    public static boolean checkUnShowSquare(String str) {
        String string = SPUtils.getInstance().getString(Code.unShowSquare, "X6,X6h,X6H,X6HP");
        if (StringUtils.isEmpty(string) || StringUtils.isEmpty(str)) {
            return true;
        }
        return string.contains(str);
    }

    public static int getPrintEneragy(int i, int i2, boolean z) {
        int moderationEneragy;
        PrinterModel.DataBean printerModel2 = getPrinterModel();
        int i3 = Code.DEFCONCENTRATIONS;
        if (Code.OFFICE_PRINT.equals(SPUtils.getInstance().getString(Code.ACTIVITY_NAME))) {
            moderationEneragy = printerModel2.getTextEneragy();
        } else if (Code.IMG_PRINT_TYPE == i2 || Code.IMG_PRINT_LABEL == i2) {
            moderationEneragy = printerModel2.getModerationEneragy();
            if (printerModel2.isGrayPrint() && z) {
                moderationEneragy = printerModel2.getGrayModerationEneragy();
            }
        } else if (Code.TEXT_PRINT_TYPE == i2) {
            moderationEneragy = (printerModel2.isGrayPrint() && z) ? printerModel2.getModerationEneragy() : printerModel2.getTextEneragy();
        } else {
            moderationEneragy = 0;
        }
        double d = moderationEneragy;
        return (int) (d + (((double) (i - i3)) * 0.15d * d));
    }

    public static int getInterval() {
        PrinterModel.DataBean printerModel2 = getPrinterModel(SPUtils.getInstance().getString(Code.DEVICETYPE));
        if (printerModel2.getModelNo().equals("GB01") && SpecialPhoneMtu.createSpecialPhoneMtu().getTextMTU() != 0) {
            return SpecialPhoneMtu.createSpecialPhoneMtu().getInterval();
        }
        return printerModel2.getInterval();
    }

    public static int getSlowInterval() {
        return getPrinterModel(SPUtils.getInstance().getString(Code.DEVICETYPE)).getSlowInterval();
    }

    public static int getDevDpi() {
        try {
            return getPrinterModel(SPUtils.getInstance().getString(Code.DEVICETYPE)).getDevdpi();
        } catch (NullPointerException unused) {
            return 200;
        }
    }

    public static int getoneLength() {
        try {
            return getPrinterModel(SPUtils.getInstance().getString(Code.DEVICETYPE)).getOneLength();
        } catch (NullPointerException unused) {
            return 12;
        }
    }

    public static int getDevSize() {
        try {
            PrinterModel.DataBean printerModel2 = getPrinterModel(SPUtils.getInstance().getString(Code.DEVICETYPE));
            if (showPaperWidth(printerModel2)) {
                String string = SPUtils.getInstance().getString(Code.paperWidth);
                if (!StringUtils.isEmpty(string) && !Code.m210.equals(string)) {
                    if (Code.m113.equals(string)) {
                        return 4;
                    }
                    if (Code.m79.equals(string)) {
                        return 3;
                    }
                    if (Code.m57.equals(string)) {
                        return 2;
                    }
                }
                return 8;
            }
            return printerModel2.getSize();
        } catch (NullPointerException unused) {
            return 12;
        }
    }

    public static int getEightImageMaxHigh(PrinterModel.DataBean dataBean) {
        try {
            if (dataBean.getDevdpi() == 300) {
                return (int) (((double) 2200) * 1.5d);
            }
            return 2200;
        } catch (NullPointerException unused) {
            return 0;
        }
    }

    public static int getEightImageMaxHigh() {
        try {
            if (getPrinterModel(SPUtils.getInstance().getString(Code.DEVICETYPE)).getDevdpi() == 300) {
                return (int) (((double) 2200) * 1.5d);
            }
            return 2200;
        } catch (NullPointerException unused) {
            return 0;
        }
    }

    public static int getEightMaxHigh() {
        try {
            if (getPrinterModel(SPUtils.getInstance().getString(Code.DEVICETYPE)).getDevdpi() == 300) {
                return (int) (((double) 2400) * 1.5d);
            }
            return 2400;
        } catch (NullPointerException unused) {
            return 0;
        }
    }

    public static int getEightMaxHigh(PrinterModel.DataBean dataBean) {
        try {
            if (dataBean.getDevdpi() == 300) {
                return 3800;
            }
            return "X9".equals(dataBean.getModelNo()) ? 2460 : 2400;
        } catch (NullPointerException unused) {
            return 0;
        }
    }
}
