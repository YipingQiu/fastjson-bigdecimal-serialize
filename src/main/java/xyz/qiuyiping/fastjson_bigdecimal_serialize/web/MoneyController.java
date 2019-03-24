package xyz.qiuyiping.fastjson_bigdecimal_serialize.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.qiuyiping.fastjson_bigdecimal_serialize.entity.MoneyEntity;

import java.math.BigDecimal;

@RestController
public class MoneyController {

    @GetMapping("/money")
    public Object money() {
        MoneyEntity moneyEntity = new MoneyEntity();
        moneyEntity.setNoFormatMoney(new BigDecimal(123.45));
        moneyEntity.setFormatMoney(new BigDecimal(67.89));
        moneyEntity.setCurrencyType("人民币");
        return moneyEntity;
    }

}
