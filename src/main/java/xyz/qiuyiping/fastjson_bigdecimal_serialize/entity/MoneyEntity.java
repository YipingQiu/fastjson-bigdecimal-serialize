package xyz.qiuyiping.fastjson_bigdecimal_serialize.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;

public class MoneyEntity {

    private BigDecimal noFormatMoney;

    @JSONField(format = "￥#0.00")
    private BigDecimal formatMoney;

    private String currencyType;

    public BigDecimal getNoFormatMoney() {
        return noFormatMoney;
    }

    public void setNoFormatMoney(BigDecimal noFormatMoney) {
        this.noFormatMoney = noFormatMoney;
    }

    public BigDecimal getFormatMoney() {
        return formatMoney;
    }

    public void setFormatMoney(BigDecimal formatMoney) {
        this.formatMoney = formatMoney;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }
}
