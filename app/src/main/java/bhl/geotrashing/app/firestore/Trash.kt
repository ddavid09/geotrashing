package bhl.geotrashing.app.firestore

import com.google.firebase.Timestamp
import com.google.firebase.firestore.GeoPoint
import com.google.firebase.firestore.IgnoreExtraProperties


@IgnoreExtraProperties
data class Trash(
    var locationGeoPoint: GeoPoint = GeoPoint(0.0,0.0),
    var creatorID: Int = 0,
    var pictureID: Int = 0,
    var description: String = "brak",
    var collected: Boolean = false,
    var timestamp: Timestamp = Timestamp.now()

)

