package org.fbi.aicqde.domain.starring.T1070Response;


import org.fbi.linking.codec.dataformat.annotation.DataField;
import org.fbi.linking.codec.dataformat.annotation.SeperatedTextMessage;

@SeperatedTextMessage(separator = "\\|",  mainClass = true)
public class TOA1070 {
    @DataField(seq = 1)
    private java.lang.String actNo; //入资帐号

    @DataField(seq = 2)
    private java.lang.String entName;   //企业名称

    @DataField(seq = 3)
    private java.lang.String bankName;   //入资银行名称

    //============================
    public String getActNo() {
        return actNo;
    }

    public void setActNo(String actNo) {
        this.actNo = actNo;
    }

    public String getEntName() {
        return entName;
    }

    public void setEntName(String entName) {
        this.entName = entName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public String toString() {
        return "TOA1070{" +
                "actNo='" + actNo + '\'' +
                ", entName='" + entName + '\'' +
                ", bankName='" + bankName + '\'' +
                '}';
    }
}
