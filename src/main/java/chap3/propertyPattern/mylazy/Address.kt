package chap3.propertyPattern.mylazy


// 리스트는 DB에 저장되어 있고, 리스트를 읽어오는 데 시간이 많이 걸리기 때문에 주소록은 객체 생성 시에
// 초기화하지 않고, 주소록에 접근할 일이 있을 때 DB 에서 읽어온 값으로 초기화 하고 싶다.
data class Address(val name: String, var phone: String, var addr: String = "") {
}

fun loadAddrBook(p: Being): List<Address> {
    println("Load ${p.name}")
    return listOf<Address>()
}

interface Being {
    val name: String
}

class Person(override val name: String) : Being {
    private var _addrBook: List<Address>? = null
    val addrBook: List<Address>
        get() {
            if (_addrBook == null) _addrBook = loadAddrBook(this)
            return _addrBook!!
        }
}

class Person2(override val name: String) : Being {
    val addrBook by lazy { loadAddrBook(this) }
}