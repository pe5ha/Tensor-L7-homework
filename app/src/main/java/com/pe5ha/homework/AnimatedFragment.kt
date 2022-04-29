package com.pe5ha.homework

import android.animation.ArgbEvaluator
import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.os.Bundle
import android.transition.ChangeBounds
import android.transition.Scene
import android.transition.TransitionManager
import android.transition.TransitionSet
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AccelerateDecelerateInterpolator
import android.widget.Button
import androidx.annotation.Dimension


class AnimatedFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.scene_1, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.animation_button).setOnClickListener {
//            val square = view.findViewById<View>(R.id.square)
//            animeSquare(square)
            anime()
        }
    }
    fun anime(){
        val scene = Scene.getSceneForLayout(requireView() as ViewGroup, R.layout.scene_2,requireContext())
        TransitionManager.go(scene, TransitionSet().apply {
            addTransition(ChangeBounds().setDuration(400L))
        })
    }


//
//    fun animeSquare(squareView: View){
//
//        ObjectAnimator.ofArgb(squareView,"textColor",)
//
//
//        val width = PropertyValuesHolder.ofFloat(
//            "width",
//            resources.getDimension(R.dimen.square_first),
//            resources.getDimension(R.dimen.square_second)
//        )
//        width.setEvaluator(ArgbEvaluator())
//        val height = PropertyValuesHolder.ofFloat(
//            "layout_height",
//            resources.getDimension(R.dimen.square_first),
//            resources.getDimension(R.dimen.square_second)
//        )
//        val background = PropertyValuesHolder.ofObject(
//            View.,
//            resources.getColor(R.color.square_first,null),
//            resources.getColor(R.color.square_second,null)
//        )
//        background.propertyName = "background"
//
//        ObjectAnimator.ofPropertyValuesHolder(squareView,height,width,background).apply {
//            duration = 3000
//            start()
//        }
//    }

}