package com.nandroidex.faceview

import android.content.Context
import android.graphics.*
import android.graphics.drawable.BitmapDrawable
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView

open class CircularImageView : AppCompatImageView {
    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(
        context,
        attrs
    )

    constructor(
        context: Context?,
        attrs: AttributeSet?,
        defStyle: Int
    ) : super(context, attrs, defStyle)

    override fun onDraw(canvas: Canvas) {
        val drawable = drawable ?: return
        if (width == 0 || height == 0) {
            return
        }
        val b = (drawable as BitmapDrawable).bitmap
        val bitmap = b.copy(Bitmap.Config.ARGB_8888, true)
        val w = width
        val roundBitmap = getCroppedBitmap(bitmap, w)
        canvas.drawBitmap(roundBitmap, 0f, 0f, null)
    }

    companion object {
        fun getCroppedBitmap(bmp: Bitmap, radius: Int): Bitmap {
            val sbmp: Bitmap
            sbmp = if (bmp.width != radius || bmp.height != radius) {
                val smallest =
                    Math.min(bmp.width, bmp.height).toFloat()
                val factor = smallest / radius
                Bitmap.createScaledBitmap(
                    bmp,
                    (bmp.width / factor).toInt(),
                    (bmp.height / factor).toInt(), false
                )
            } else {
                bmp
            }
            val output = Bitmap.createBitmap(radius, radius, Bitmap.Config.ARGB_8888)
            val canvas = Canvas(output)
            val color = "#BAB399"
            val paint = Paint()
            val rect = Rect(0, 0, radius, radius)
            paint.isAntiAlias = true
            paint.isFilterBitmap = true
            paint.isDither = true
            canvas.drawARGB(0, 0, 0, 0)
            paint.color = Color.parseColor(color)
            canvas.drawCircle(
                radius / 2 + 0.7f, radius / 2 + 0.7f,
                radius / 2 + 0.1f, paint
            )
            paint.xfermode = PorterDuffXfermode(PorterDuff.Mode.SRC_IN)
            canvas.drawBitmap(sbmp, rect, rect, paint)
            return output
        }
    }
}