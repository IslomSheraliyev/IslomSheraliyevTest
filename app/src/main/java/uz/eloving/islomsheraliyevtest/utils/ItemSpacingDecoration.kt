package uz.eloving.islomsheraliyevtest.utils

import android.content.Context
import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class ItemSpacingDecoration(private val context: Context, dpSpaceSize: Int) :
    RecyclerView.ItemDecoration() {

    private val spaceSize: Int = dpToPx(dpSpaceSize, context)

    override fun getItemOffsets(
        outRect: Rect, view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        with(outRect) {
            left = spaceSize
            right = spaceSize

            if (parent.getChildAdapterPosition(view) == 0) {
                left = dpToPx(16, context)
            }
            if (parent.getChildAdapterPosition(view) == parent.adapter!!.itemCount - 1) {
                right = dpToPx(16, context)
            }
        }
    }

    private fun dpToPx(dp: Int, context: Context): Int {
        val density = context.resources.displayMetrics.density
        return (dp * density).toInt()
    }
}
