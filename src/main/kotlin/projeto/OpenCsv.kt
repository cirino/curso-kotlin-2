package projeto

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule

open class Flower(s: String, s1: Color, i: Int) {
    val name: String? = s
    val color: Color? = s1
    val petals: Int? = i // getters and setters
}

enum class Color {
    PINK, BLUE, YELLOW, RED
}

fun main() {
    val mapper = ObjectMapper().registerModule(KotlinModule())
//    val xmlMapper = XmlMapper()
//    val xml = "<Flower><name>Poppy</name><color>BLUE</color><petals>9</petals></Flower>"
    val flor = Flower("Endgame", Color.RED, 9)
//    val poppy: Flower = xmlMapper.readValue(xml, Flower::class.java)

//    val mapper = ObjectMapper()
    val json = mapper.writeValueAsString(flor)

    println(json)

//    val mapper = ObjectMapper()
//    val module = SimpleModule()
//    module.addDeserializer(Item::class.java, ItemDeserializer())
//    mapper.registerModule(module)

//    val readValue: Item = mapper.readValue(json, Item::class.java)

//    val readValue = ObjectMapper().readValue(json, Item::class.java)
//    println(readValue)

}

//class ItemDeserializer @JvmOverloads constructor(vc: Class<*>? = null) : StdDeserializer<Item?>(vc) {
//    @Throws(IOException::class, JsonProcessingException::class)
//    override fun deserialize(jp: JsonParser, ctxt: DeserializationContext?): Item {
//        val node = jp.codec.readTree<JsonNode>(jp)
//        val id = (node["id"] as IntNode).numberValue() as Int
//        val itemName = node["itemName"].asText()
//        val userId = (node["createdBy"] as IntNode).numberValue() as Int
//        return Item(id, itemName, User(userId, null))
//    }
//}