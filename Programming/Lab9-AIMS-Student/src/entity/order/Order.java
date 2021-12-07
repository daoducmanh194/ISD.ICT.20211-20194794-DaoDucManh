package entity.order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javafx.scene.media.Media;
import utils.Configs;

/**
 * This class for getting the price for each order
 * @author genkibaskervillge
 * @version 1.0.0
 * @since 1.0
 * @param Properties of a order
 * @return Price for order
 */
public class Order {
    
    private int shippingFees;
    private List lstOrderMedia;
    private HashMap<String, String> deliveryInfo;

    public Order(){
        this.lstOrderMedia = new ArrayList<>();
    }

    public Order(List lstOrderMedia) {
        this.lstOrderMedia = lstOrderMedia;
    }

    public void addOrderMedia(OrderMedia om){
        this.lstOrderMedia.add(om);
    }

    public void removeOrderMedia(OrderMedia om){
        this.lstOrderMedia.remove(om);
    }

    public List getlstOrderMedia() {
        return this.lstOrderMedia;
    }

    public void setlstOrderMedia(List lstOrderMedia) {
        this.lstOrderMedia = lstOrderMedia;
    }

    public void setShippingFees(int shippingFees) {
        this.shippingFees = shippingFees;
    }

    public int getShippingFees() {
        return shippingFees;
    }

    public HashMap getDeliveryInfo() {
        return deliveryInfo;
    }

    public void setDeliveryInfo(HashMap deliveryInfo) {
        this.deliveryInfo = deliveryInfo;
    }
    
    /**
     * This class for getting the price for each order
     * @author genkibaskervillge
     * @version 1.0.0
     * @since 1.0
     * @param list pf Order
     * @return Price for order
     */
    public int getAmount(){
        double amount = 0;
        for (Object object : lstOrderMedia) {
            OrderMedia om = (OrderMedia) object;
            amount += om.getPrice();
            entity.media.Media m = om.getMedia();
            if (m.isSupportRush()) {
            	amount += 10000;
            }
        }
        return (int) (amount + (Configs.PERCENT_VAT/100)*amount);
    }

}
