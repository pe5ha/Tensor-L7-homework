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
            anime()
        }
    }

    fun anime() {
        val scene =
            Scene.getSceneForLayout(requireView() as ViewGroup, R.layout.scene_2, requireContext())
        TransitionManager.go(scene, TransitionSet().apply {
            addTransition(ChangeBounds().setDuration(400L))
        })
    }
}