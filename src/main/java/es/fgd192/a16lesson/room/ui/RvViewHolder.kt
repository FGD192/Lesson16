package es.fgd192.a16lesson.room.ui

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import es.fgd192.a16lesson.room.data.ETdata
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.item_recyclerview.view.*

class RvViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    fun bind(
        item: ETdata
    ) {
        itemView.TeVi.text = item.ETone
        itemView.TeVi2.text = item.ETtwo
    }
}
