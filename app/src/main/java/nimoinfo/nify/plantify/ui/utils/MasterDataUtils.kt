package nimoinfo.nify.plantify.ui.utils

import android.content.Context
import nimoinfo.nify.plantify.ui.adapter.ImageSlideAdapter
import nimoinfo.nify.plantify.ui.data.Plant



object MasterDataUtils {
    var itemList = ArrayList<Plant>()
    fun Contextlist(Context: Context): ArrayList<Plant> {
        val itemList = ArrayList<Plant>()
        itemList.add(
            Plant(
                "https://media.istockphoto.com/id/1181366400/photo/in-the-hands-of-trees-growing-seedlings-bokeh-green-background-female-hand-holding-tree-on.jpg?s=612x612&w=0&k=20&c=jWUMrHgjMY9zQXsAwZFb1jfM6KxZE16-IXI1bvehjQM=",
                dataItemName = "Cactus"
            )
        )

        itemList.add(
            Plant(
                "https://www.freepik.com/premium-vector/dieffenbachia-home-plant-isolated-flat-vector-illustration-white-background_348245002.htm",
                dataItemName = "African iris"
            )
        )
        itemList.add(
            Plant(
                "https://watchandlearn.scholastic.com/content/dam/classroom-magazines/watchandlearn/videos/animals-and-plants/plants/what-are-plants-/What-Are-Plants.jpg",
                dataItemName = "Dahlia"
            )
        )

        itemList.add(
            Plant(
                "https://www.thespruce.com/grow-great-garlic-3016629",
                dataItemName = "Garlic"
            )
        )

        itemList.add(
            Plant(
                "https://www.thespruce.com/purple-ice-plant-2132553",
                dataItemName = "Ice Plant"
            )
        )
        return itemList
    }

    fun viewPagerImage() : ArrayList<String> {

        val itemList = ArrayList<String>()

        itemList.add("https://www.powermaxfitness.net/uploads/thumb/800_600_1733736318_product_09122024145518.png")
        itemList.add("https://www.freepik.com/premium-vector/dieffenbachia-home-plant-isolated-flat-vector-illustration-white-background_348245002.htm")
        itemList.add("https://www.powermaxfitness.net/uploads/thumb/800_600_1571289430_product_17102019104710.jpg")
        itemList.add("https://4.imimg.com/data4/EA/RV/MY-8497149/pec-fly-1000x1000.jpg")
        return itemList
    }
}


