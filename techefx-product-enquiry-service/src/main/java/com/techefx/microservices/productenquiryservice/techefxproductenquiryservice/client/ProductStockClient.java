package com.techefx.microservices.productenquiryservice.techefxproductenquiryservice.client;

import com.techefx.microservices.productenquiryservice.techefxproductenquiryservice.beans.ProductEnquiryBean;
//import org.springframework.cloud.netflix.ribbon.RibbonClient;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.cloud.netflix.feign.FeignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//Not using LB or Register service, we need to use url manually
@FeignClient(name="techefx-product-stock-service", url="localhost:8800")
public interface ProductStockClient {

   @GetMapping("/check-product-stock/productName/{productName}/productAvailability/{productAvailability}")
    public ProductEnquiryBean checkProductStock(@PathVariable String productName,
                                              @PathVariable String productAvailability);

}