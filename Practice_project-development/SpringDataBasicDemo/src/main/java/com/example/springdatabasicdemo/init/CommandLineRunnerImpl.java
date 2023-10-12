package com.example.springdatabasicdemo.init;

import com.example.springdatabasicdemo.dtos.*;
import com.example.springdatabasicdemo.enums.Category;
import com.example.springdatabasicdemo.enums.Engine;
import com.example.springdatabasicdemo.enums.Role;
import com.example.springdatabasicdemo.enums.Transmission;
import com.example.springdatabasicdemo.models.Brand;
import com.example.springdatabasicdemo.models.User;
import com.example.springdatabasicdemo.models.UserRole;
import com.example.springdatabasicdemo.services.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {
    @Autowired
    CrudService <BrandDto, Integer> brandService;
    @Autowired
    CrudService <ModelDto, Integer> modelService;
    @Autowired
    CrudService <OfferDto, Integer> offerService;
    @Autowired
    CrudService <UserDto, Integer> userService;
    @Autowired
    CrudService <UserRoleDto, Integer> roleService;

    @Override
    public void run(String... args) throws Exception {
       UserRoleDto ur = new UserRoleDto(1, Role.User);
       UserRoleDto ur1 = new UserRoleDto(2, Role.Admin);

        UserDto user1 = new UserDto(1, "anton1", "password1", "Anton", "Lastname1", true, "image1.jpg", ur, null, null);
        UserDto user2 = new UserDto(2, "anton2", "password2", "Anton", "Lastname2", true, "image2.jpg", ur1, null, null);
        UserDto user3 = new UserDto(3, "anton3", "password3", "Anton", "Lastname3", true, "image3.jpg", ur, null, null);
        UserDto user4 = new UserDto(4, "anton4", "password4", "Anton", "Lastname4", true, "image4.jpg", ur1, null, null);
        UserDto user5 = new UserDto(5, "anton5", "password5", "Anton", "Lastname5", true, "image5.jpg", ur, null, null);

        BrandDto brand1 = new BrandDto(1, "Brand 1", null, null);
        BrandDto brand2 = new BrandDto(2, "Brand 2", null, null);
        BrandDto brand3 = new BrandDto(3, "Brand 3", null, null);
        BrandDto brand4 = new BrandDto(4, "Brand 4", null, null);
        BrandDto brand5 = new BrandDto(5, "Brand 5", null, null);

        ModelDto model1 = new ModelDto(1, "Model 1", Category.Buss, "image1.jpg", 2000, 2020, null, null, null, brand1);
        ModelDto model2 = new ModelDto(2, "Model 2", Category.Car, "image2.jpg", 2005, 2019, null, null, null, brand2);
        ModelDto model3 = new ModelDto(3, "Model 3", Category.Truck, "image3.jpg", 2010, 2021, null, null, null, brand3);
        ModelDto model4 = new ModelDto(4, "Model 4", Category.Motorcycle, "image4.jpg", 2008, 2017, null, null, null, brand4);
        ModelDto model5 = new ModelDto(5, "Model 5", Category.Buss, "image5.jpg", 2012, 2022, null, null, null, brand5);

        OfferDto offer1 = new OfferDto(1, "Offer 1", Engine.DIESEL, "image1.jpg", 10000, BigDecimal.valueOf(10000), Transmission.AUTOMATIC, 2010, null, null, model1, user1);
        OfferDto offer2 = new OfferDto(2, "Offer 2", Engine.GASOLINE, "image2.jpg", 20000, BigDecimal.valueOf(20000), Transmission.AUTOMATIC, 2015, null, null, model2, user2);
        OfferDto offer3 = new OfferDto(3, "Offer 3", Engine.HYBRID, "image3.jpg", 15000, BigDecimal.valueOf(15000), Transmission.AUTOMATIC, 2012, null, null, model3, user3);
        OfferDto offer4 = new OfferDto(4, "Offer 4", Engine.DIESEL, "image4.jpg", 18000, BigDecimal.valueOf(18000), Transmission.AUTOMATIC, 2014, null, null, model4, user4);
        OfferDto offer5 = new OfferDto(5, "Offer 5", Engine.DIESEL, "image5.jpg", 12000, BigDecimal.valueOf(12000), Transmission.MANUAL, 2018, null, null, model5, user5);

        // Используйте ваши сервисы для сохранения объектов в базе данных
        roleService.register(ur);
        roleService.register(ur1);

        userService.register(user1);
        userService.register(user2);
        userService.register(user3);
        userService.register(user4);
        userService.register(user5);

        brandService.register(brand1);
        brandService.register(brand2);
        brandService.register(brand3);
        brandService.register(brand4);
        brandService.register(brand5);

        modelService.register(model1);
        modelService.register(model2);
        modelService.register(model3);
        modelService.register(model4);
        modelService.register(model5);

        offerService.register(offer1);
        offerService.register(offer2);
        offerService.register(offer3);
        offerService.register(offer4);
        offerService.register(offer5);

    }

}
