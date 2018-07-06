package com.test;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//



import java.util.HashSet;
import java.util.Set;

public enum TradeCode {
    MANUAL_REPAY(1, "主动还款"),
    AUTO_REPAY(2, "自动还款"),
    PAY(3, "支用"),
    DAY_END(4, "日终处理"),
    MANDATORY_REPAY(5, "强制扣款"),
    OFFLINE_REPAY(6, "线下还款"),
    ASSET_PRESERVATION(7, "资产保全"),
    CONSUMPTION_LOAN(8, "消费贷款"),
    REFUND(9, "分期退款"),
    LOAN_EXTEND(10, "展期"),
    INTEREST_FREE(11, "免息"),
    INTEREST_REFUND(12, "退息"),
    AGENCY_SERVICE(13, "代发"),
    STRIKE_PAYMENT(14, "支用抹账"),
    REPLENISH_PAYMENT(15, "支用补帐"),
    REPLENISH_REPAYMENT(16, "还款补帐"),
    REPLENISH_TMP(17, "历史账务修复，临时类型"),
    MIPAY_REFUND(20, "支付退款"),
    ABS_TRANSFER(21, "ABS资产转让"),
    REPLENISH_WITH_DRAW(22, "代发失败重发"),
    OFFLINE_WITHDRAW(23, "线下还款代发"),
    REFUND_WITHDRAW(24, "退款代发"),
    NORMAL_ADJUST(25, "正常的调账"),
    DELAY_ADJUST(26, "因回购延迟带来的调账"),
    BUY_BACK(27, "回购"),
    OFFLINE_CARD_WITHDRAW(28, "线下还款代发到卡"),
    REFUND_CARD_WITHDRAW(29, "分期退款代发到卡"),
    OFFLINE_BALANCE_WITHDRAW(30, "线下还款代发到余额"),
    REFUND_BALANCE_WITHDRAW(31, "分期退款代发到余额"),
    ABS_BUY_BACK(32, "ABS回购"),
    INTEREST_FREE_DELAY_ADJUST(33, "免息造成的延迟调账"),
    REFUND_DELAY_ADJUST(34, "分期退款造成的延迟调账"),
    ASSET_PRESERVATION_ADJUST(35, "资产保全造成的延迟调账"),
    OFFLINE_REPAY_DELAY_ADJUST(36, "线下还款造成的延迟调账"),
    ACCRUAL(37, "非应计打标");

    private int value;
    private String desc;

    private TradeCode(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public int getValue() {
        return this.value;
    }

    public String getDesc() {
        return this.desc;
    }

    public static TradeCode getByValue(int value) {
        TradeCode[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            TradeCode type = var1[var3];
            if (value == type.getValue()) {
                return type;
            }
        }

        return null;
    }

    public static Set<Integer> getPaymentTradeCodes() {
        return new HashSet<Integer>() {
            {
                this.add(TradeCode.PAY.getValue());
                this.add(TradeCode.CONSUMPTION_LOAN.getValue());
            }
        };
    }

    public static Set<Integer> getRepaymentTradeCodes() {
        return new HashSet<Integer>() {
            {
                this.add(TradeCode.MANUAL_REPAY.getValue());
                this.add(TradeCode.AUTO_REPAY.getValue());
                this.add(TradeCode.MANDATORY_REPAY.getValue());
                this.add(TradeCode.OFFLINE_REPAY.getValue());
                this.add(TradeCode.REPLENISH_REPAYMENT.getValue());
            }
        };
    }

    public static Set<Integer> getDelayAdjustTradeCodes() {
        return new HashSet<Integer>() {
            {
                this.add(TradeCode.DELAY_ADJUST.getValue());
                this.add(TradeCode.INTEREST_FREE_DELAY_ADJUST.getValue());
                this.add(TradeCode.REFUND_DELAY_ADJUST.getValue());
                this.add(TradeCode.ASSET_PRESERVATION_ADJUST.getValue());
                this.add(TradeCode.OFFLINE_REPAY_DELAY_ADJUST.getValue());
            }
        };
    }
}
