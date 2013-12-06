package org.fbi.linking.codec.dataformat.samples.staringmodel.T1000;


import org.fbi.linking.codec.dataformat.annotation.DataField;
import org.fbi.linking.codec.dataformat.annotation.OneToManySeperatedTextMessage;

/**
 * Created with IntelliJ IDEA.
 * User: zhanrui
 * Date: 13-9-10
 * Time: ����5:44
 */
@OneToManySeperatedTextMessage(separator = ",")
public class Item {
    @DataField(seq = 1)
    private java.lang.String itemNo;

    @DataField(seq = 2)
    private java.lang.String itemName;


    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
