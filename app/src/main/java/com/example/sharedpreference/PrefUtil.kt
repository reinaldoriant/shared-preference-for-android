package com.example.sharedpreference

import android.content.Context
import android.content.SharedPreferences

private const val KEY_LGN = "keyLgn"
private const val KEY_EMAIL = "keyEmail"
private const val KEY_PASS = "keyPass"

object PrefUtil {

    private val sharedPref: SharedPreferences? =
        App.context?.getSharedPreferences("db_login", Context.MODE_PRIVATE)

    var isLogin: Boolean?
        get() {
            return sharedPref?.getBoolean(KEY_LGN, false)
        }
        set(value) {
            value?.let {
                sharedPref?.edit()?.putBoolean(KEY_LGN, it)?.apply()
            }
        }
    var name: String?
        get() {
            return sharedPref?.getString(KEY_EMAIL, "")
        }
        set(value) {
            value?.let {
                sharedPref?.edit()?.putString(KEY_EMAIL, it)?.apply()
            }
        }
    var pass: String?
        get() {
            return sharedPref?.getString(KEY_PASS, "")
        }
        set(value) {
            value?.let {
                sharedPref?.edit()?.putString(KEY_PASS, it)?.apply()
            }
        }
}