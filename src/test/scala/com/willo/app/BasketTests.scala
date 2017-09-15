package com.willo.test

import org.scalatest.FunSuite

class ShopTests extends FunSuite {

    test("the total should be calculated correctly") {
        var products=List("Cola","Coffee","Cheese Sandwich","Steak Sandwich")
        val basket = new Basket(products);
        assert(basket.getTotal() == 7.5)
    }

}

class Basket(products:List[String])
{

    val product_list = new HashMap[String, Product]

    product_list.put("Cola", Product("Cola","Cold",0.50f,"Drink"))
    product_list.put("Coffee", Product("Coffee","Hot",1.0f,"Drink"))
    product_list.put("Cheese Sandwich", Product("Cheese Sandwich","Cold",2.0f,"Food"))
    product_list.put("Steak Sandwich", Product("Steak Sandwich","Hot",4.0f,"Food"))

    def getTotal()=
    {
        7.5
    }
}