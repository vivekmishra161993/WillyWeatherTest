package com.app.willyweathertest.utils
import androidx.annotation.IdRes
import androidx.annotation.NonNull
import androidx.annotation.Nullable
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment


abstract class BaseActivity : AppCompatActivity() {

    protected open fun addFragment(
        @IdRes containerViewId: Int,
        @NonNull fragment: Fragment?,
        @NonNull fragmentTag: String?
    ) {
        supportFragmentManager
            .beginTransaction()
            .add(containerViewId, fragment!!, fragmentTag)
            .disallowAddToBackStack()
            .commit()
    }

    protected open fun replaceFragment(
        @IdRes containerViewId: Int,
        @NonNull fragment: Fragment?,
        @NonNull fragmentTag: String?,
        @Nullable backStackStateName: String?
    ) {
        supportFragmentManager
            .beginTransaction()
            .replace(containerViewId, fragment!!, fragmentTag)
            .addToBackStack(backStackStateName)
            .commit()
    }

}
