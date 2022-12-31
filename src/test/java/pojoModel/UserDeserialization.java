package pojoModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

public class UserDeserialization {
 //   @JsonPropertyOrder({"page","per_page","total","total_pages","data"})


    private int page;
    @JsonProperty("per_page")
    private int per_page;
    private int total;
    @JsonProperty("total_pages")

    private int total_pages;
    private List<DataDeserialization> data;
    private List<Support> support;


    public List<Support> getSupport() {
        return support;
    }

    public void setSupport(List<Support> support) {
        this.support = support;
    }





    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
    @JsonProperty("per_page")
    public int getPer_page() {
        return per_page;
    }
    @JsonProperty("per_page")
    public void setPer_page(int per_page) {
        this.per_page = per_page;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    @JsonProperty("total_pages")
    public int getTotal_pages() {
        return total_pages;
    }
    @JsonProperty("total_pages")
    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public List<DataDeserialization> getData() {
        return data;
    }

    public void setData(List<DataDeserialization> data) {
        this.data = data;
    }









}
