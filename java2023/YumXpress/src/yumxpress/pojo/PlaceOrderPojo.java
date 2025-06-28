
package yumxpress.pojo;


public class PlaceOrderPojo {

    @Override
    public String toString() {
        return "PlaceOrderPojo{" + "orderId=" + orderId + ", productId=" + productId + ", customerId=" + customerId + ", deliveryStaffId=" + deliveryStaffId + ", companyId=" + companyId + '}';
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getDeliveryStaffId() {
        return deliveryStaffId;
    }

    public void setDeliveryStaffId(String deliveryStaffId) {
        this.deliveryStaffId = deliveryStaffId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public PlaceOrderPojo(String orderId, String productId, String customerId, String deliveryStaffId, String companyId) {
        this.orderId = orderId;
        this.productId = productId;
        this.customerId = customerId;
        this.deliveryStaffId = deliveryStaffId;
        this.companyId = companyId;
    }
    
    private String orderId;
    private String productId;
    private String customerId;
    private String deliveryStaffId;
    private String companyId;
    
    public PlaceOrderPojo() {
        
    }
    
}


//package yumxpress.pojo;
//
//public class PlaceOrderPojo {
//    
//    private String orderId;
//    private String productId;
//    private String customerId;
//    private String staffId;
//    private String companyId;
//
//    // Constructors, getters, and setters
//
//    public PlaceOrderPojo() {
//        // Default constructor
//    }
//
//    public PlaceOrderPojo(String orderId, String productId, String customerId, String staffId, String companyId) {
//        this.orderId = orderId;
//        this.productId = productId;
//        this.customerId = customerId;
//        this.staffId = staffId;
//        this.companyId = companyId;
//    }
//
//    // Getters and setters for each field
//
//    public String getOrderId() {
//        return orderId;
//    }
//
//    public void setOrderId(String orderId) {
//        this.orderId = orderId;
//    }
//
//    public String getProductId() {
//        return productId;
//    }
//
//    public void setProductId(String productId) {
//        this.productId = productId;
//    }
//
//    public String getCustomerId() {
//        return customerId;
//    }
//
//    public void setCustomerId(String customerId) {
//        this.customerId = customerId;
//    }
//
//    public String getStaffId() {
//        return staffId;
//    }
//
//    public void setStaffId(String staffId) {
//        this.staffId = staffId;
//    }
//
//    public String getCompanyId() {
//        return companyId;
//    }
//
//    public void setCompanyId(String companyId) {
//        this.companyId = companyId;
//    }
//
//}
