package uz.eloving.islomsheraliyevtest.ui.fragment.tickets

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import uz.eloving.islomsheraliyev.domain.model.offers.OffersItemModel
import uz.eloving.islomsheraliyevtest.R
import uz.eloving.islomsheraliyevtest.databinding.ItemOffersBinding

class TicketsAdapter : ListAdapter<OffersItemModel, TicketsAdapter.ViewHolder>(COMPARATOR) {

    val imageIds = hashMapOf(
        1 to R.drawable.img_girl,
        2 to R.drawable.img_group,
        3 to R.drawable.img_man
    )

    inner class ViewHolder(private val binding: ItemOffersBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(data: OffersItemModel) {
            imageIds[data.id]?.let { binding.ivSinger.setImageResource(it) }
            binding.tvName.text = data.title
            binding.tvCity.text = data.town
            binding.tvPrice.text = itemView.context.getString(
                R.string.price, data.price.value.toString()
            )
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TicketsAdapter.ViewHolder {
        val layout = ItemOffersBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(layout)
    }

    override fun onBindViewHolder(holder: TicketsAdapter.ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    companion object {
        val COMPARATOR = object : DiffUtil.ItemCallback<OffersItemModel>() {
            override fun areItemsTheSame(
                oldItem: OffersItemModel,
                newItem: OffersItemModel
            ): Boolean = oldItem == newItem

            override fun areContentsTheSame(
                oldItem: OffersItemModel,
                newItem: OffersItemModel
            ): Boolean = oldItem.id == newItem.id
        }
    }
}