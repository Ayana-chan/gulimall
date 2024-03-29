package cn.ayana.gulimall.product;

import cn.ayana.gulimall.product.entity.BrandEntity;
import cn.ayana.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("");
        brandEntity.setName("白象");
        brandService.save(brandEntity);
        System.out.println("保存成功！");
    }

}
