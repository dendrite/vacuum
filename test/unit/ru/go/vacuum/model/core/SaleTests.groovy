package ru.go.vacuum.model.core



import grails.test.mixin.*
import ru.go.vacuum.model.AttributeItem
import ru.go.vacuum.model.Stuff
import ru.go.vacuum.model.StuffAttributes
import ru.go.vacuum.model.StuffCategory
import ru.go.vacuum.model.User

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Sale)
class SaleTests {

    void testSaleItemAdd(){


        def stuffType = new StuffCategory(name: "Одежда");

        def attrSize = new StuffAttributes(title: "Размеры Российские", type: stuffType, attributeType: AttributeItem.TypeItem.INTEGER)

        attrSize
                .add(new AttributeItem(name: "40", value: 40, type: AttributeItem.TypeItem.INTEGER))
                .add(new AttributeItem(name: "42", value: 42, type: AttributeItem.TypeItem.INTEGER))
                .add(new AttributeItem(name: "46", value: 46, type: AttributeItem.TypeItem.INTEGER))

        def attrColor = new StuffAttributes(title: "Цвет отображения", type: new StuffCategory(name: "Одежда"), attributeType: AttributeItem.TypeItem.STRING)

        attrColor
                .add(new AttributeItem(name: "Красный", value: "#FF0000", type: AttributeItem.TypeItem.STRING))
                .add(new AttributeItem(name: "Синий", value: "#00FF00", type: AttributeItem.TypeItem.STRING))
                .add(new AttributeItem(name: "Зеленый", value: "#0000FF", type: AttributeItem.TypeItem.STRING))


        println "Размеры = " + attrSize
        println "Цвета = " + attrColor



        def stuff = new Stuff(title: "Куртка", type: stuffType)

        stuff
                .addAttribute(attrSize)
                .addAttribute(attrColor)

        println ""
        println "Вещь" + stuff



        println "---------------------------------------"

        println "Sale"


        def attrSizeSelected = new ArrayList<AttributeItem>()
        attrSizeSelected.add attrSize.attributes.get(0)


        def sale = new Sale()
        sale.add(stuff, attrSizeSelected)


        attrSizeSelected = new ArrayList<AttributeItem>()
        attrSizeSelected.add attrSize.attributes.get(1)

        sale.add(stuff, attrSizeSelected, 2)

        println "Sale" + sale

        def user = new User(nick: "User1");


        List<SaleItem> _saleItems = sale.saleItems

        sale.buy(user, 1, _saleItems.get(0))

        println "\n\n"
        println "Sale after buy:" + sale


    }

    void testSomething() {
    }
}
