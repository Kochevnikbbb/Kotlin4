package kg.geektech.kotlin4

import androidx.lifecycle.MutableLiveData
import kg.geektech.kotlin3.bases.BaseViewModel

class MyViewModel : BaseViewModel() {
    private var mCounter = 0
    private lateinit var storyList: MutableList<Int>
    val storyLiveData = MutableLiveData<ArrayList<String>>()
    val counter = MutableLiveData<Int>()
    val list = arrayListOf<String>()

    fun onIncrementClick() {
        mCounter++
        counter.value = mCounter
        list.add("+ \n")
        storyLiveData.value = list
    }

    fun onDecrementClick() {
        mCounter++
        counter.value = mCounter
        list.add("- \n")
        storyLiveData.value = list
    }
}