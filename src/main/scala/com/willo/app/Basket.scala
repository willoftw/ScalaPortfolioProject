package com.willo.app

import scala.collection.mutable.HashMap

class Basket(products:List[String])
{
    val product_list = new HashMap[String, Product]

    product_list.put("Cola", Product("Cola","Cold",0.50f,"Drink"))
    product_list.put("Coffee", Product("Coffee","Hot",1.0f,"Drink"))
    product_list.put("Cheese Sandwich", Product("Cheese Sandwich","Cold",2.0f,"Food"))
    product_list.put("Steak Sandwich", Product("Steak Sandwich","Hot",4.0f,"Food"))

    def getTotal()=
    {
        var sum:Float = 0
        var service:Float = 0

        for (product <- products)
        {
            sum += (product_list(product).price)
            if(product_list(product).foodtype == "Food")
                if (product_list(product).temperature == "Hot")
                    service = 20
                else
                    service = 10

        }

        sum+=((service/100)*sum);

        Math.round(100 * sum) / 100d // Round to 2 decimal places
    }
}