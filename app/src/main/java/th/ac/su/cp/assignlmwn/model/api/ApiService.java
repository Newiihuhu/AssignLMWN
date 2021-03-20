package th.ac.su.cp.assignlmwn.model.api;

import retrofit2.Call;
import retrofit2.http.GET;
import th.ac.su.cp.assignlmwn.model.item.Item;

public interface ApiService {
    @GET("v1/public/coins")
    Call<Item> getData();

}
