package ru.go.vacuum.model



import grails.test.mixin.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Stuff)
class StuffTests {

    void testCreateStuff(){

        def stuffCategory = new StuffCategory(name: "Одежда");

        def attrSize = new StuffAttributes(title: "Размеры Российские", type: stuffCategory, attributeType: AttributeItem.Type.INTEGER)

        attrSize
                .add(new AttributeItem(name: "40", value: 40, type: AttributeItem.Type.INTEGER))
                .add(new AttributeItem(name: "42", value: 42, type: AttributeItem.Type.INTEGER))
                .add(new AttributeItem(name: "46", value: 46, type: AttributeItem.Type.INTEGER))

        def attrColor = new StuffAttributes(title: "Цвет отображения", type: new StuffCategory(name: "Одежда"), attributeType: AttributeItem.Type.STRING)

        attrColor
                .add(new AttributeItem(name: "Красный", value: "#FF0000", type: AttributeItem.Type.STRING))
                .add(new AttributeItem(name: "Синий", value: "#00FF00", type: AttributeItem.Type.STRING))
                .add(new AttributeItem(name: "Зеленый", value: "#0000FF", type: AttributeItem.Type.STRING))


        println "Размеры = " + attrSize
        println "Цвета = " + attrColor



        def stuff = new Stuff(title: "Куртка", type: stuffCategory)

        stuff
                .addAttribute(attrSize)
                .addAttribute(attrColor)

        println ""
        println "Вещь" + stuff

        println  ""
        println   ""
        println attrSize.isRoot()

    }

    void testSomething() {

    }
}
