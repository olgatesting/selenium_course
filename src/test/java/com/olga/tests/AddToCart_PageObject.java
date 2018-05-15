package com.olga.tests;

import com.olga.app.Application;
import org.junit.Test;

/**
 * Created by User on 15.05.2018.
 * [x] Задание 19. Реализовать многослойную архитектуру
 Переделайте созданный в задании 13 сценарий для добавления товаров в корзину и удаления товаров из корзины, чтобы он использовал
 многослойную архитектуру.

 А именно, выделите вспомогательные классы для работы с главной страницей (откуда выбирается товар),
 для работы со страницей товара (откуда происходит добавление товара в корзину),
 со страницей корзины (откуда происходит удаление),
 и реализуйте сценарий, который не напрямую обращается к операциям Selenium, а оперирует вышеперечисленными объектами-страницами.
 *
 */
public class AddToCart_PageObject extends TestBasePO{
    @Test
    public void addToCart() {
        app.add_K_productsToCart(3);
        app.cleanTheCart();
    }
}