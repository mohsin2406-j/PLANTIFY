package nimoinfo.nify.plantify.ui.adapter

import nimoinfo.nify.plantify.R
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import nimoinfo.nify.plantify.databinding.ItemlayoutBinding
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import nimoinfo.nify.plantify.ui.data.Plant

class ItemAdapter(
    val context: Context,
    private var itemList: ArrayList<Plant>,
    private val onClickListener: OnClickListener
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = ItemlayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(itemList[position], onClickListener)
    }

    override fun getItemCount(): Int = itemList.size

    class OnClickListener(val clickListener: (itemData: Plant, clickType: Int) -> Unit) {
        fun onClick(itemData: Plant, clickType: Int) = clickListener(itemData, clickType)
    }

    inner class ItemViewHolder(private val binding: ItemlayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(dataModal: Plant, onClickListener: OnClickListener) {
            binding.textView.text = dataModal.dataItemName
            Glide.with(context)
                .load(dataModal.titleImage)
                .centerCrop()
                .placeholder(R.drawable.warning)
                .into(binding.imageview)
             }
        }
}
