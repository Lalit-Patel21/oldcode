
package in.gadgethub.dao;

import in.gadgethub.pojo.CartPojo;
import java.util.List;
public interface CartDao {
    
    public String updateProductInCart(CartPojo cart);
    public String addProductToCart(CartPojo cart);
    public List<CartPojo> getAllCartItems(String userId);
    public String removeProductFromCart(String userId, String prodId);
    public Boolean removeAProduct(String userId, String prodId);
    public int getCartItemCount(String userId, String itemId);
}
