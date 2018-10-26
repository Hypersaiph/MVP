package ai.gvs.mvp.data.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class User (
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    var name: String,
    var address: String,
    var birthDate: String,
    var phoneNumber: String,
    var email: String) {
}
