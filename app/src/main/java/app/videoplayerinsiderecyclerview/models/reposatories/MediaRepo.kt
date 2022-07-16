package app.videoplayerinsiderecyclerview.models.reposatories

import androidx.lifecycle.MutableLiveData
import app.videoplayerinsiderecyclerview.models.MediaObject
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.kotlin.addTo

class MediaRepo {
    // dummy data for get list of media objects
    public fun getMediaData(): MutableLiveData<MutableList<MediaObject>> {
        val data: MutableLiveData<MutableList<MediaObject>> = MutableLiveData()
        val dataObservable = Observable.create<MutableList<MediaObject>> {
            it.onNext(
                mutableListOf(
                    MediaObject(
                        "Big Buck Bunny",
                        "https://bitmovin-a.akamaihd.net/content/MI201109210084_1/mpds/f08e80da-bf1d-4e3d-8899-f0f6155f6efa.mpd",
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a7/Big_Buck_Bunny_thumbnail_vlc.png/1599px-Big_Buck_Bunny_thumbnail_vlc.png?20090210035013",
                        "Big Buck Bunny tells the story of a giant rabbit with a heart bigger than himself. When one sunny day three rodents rudely harass him, something snaps... and the rabbit ain't no bunny anymore! In the typical cartoon tradition he prepares the nasty rodents a comical revenge.\\n\\nLicensed under the Creative Commons Attribution license\\nhttp://www.bigbuckbunny.org"
                    ),
                    MediaObject(
                        "Elephant Dream",
                        "https://akamaibroadcasteruseast.akamaized.net/cmaf/live/657078/akasource/out.mpd",
                        "https://static.klliq.com/thumbnails/uYSHHSfB6F183ZHYk1OnBjCe5C_1yseF.png",
                        "The first Blender Open Movie from 2006"
                    ),
                    MediaObject(
                        "For Bigger Blazes",
                        "https://storage.googleapis.com/exoplayer-test-media-0/play.mp3",
                        "https://static.klliq.com/thumbnails/5a7Byj0r5ZIKC0gV9QWCneZQZEmKCP-B.png",
                        "HBO GO now works with Chromecast -- the easiest way to enjoy online video on your TV. For when you want to settle into your Iron Throne to watch the latest episodes. For \$35.\\nLearn how to use Chromecast with HBO GO and more at google.com/chromecast."
                    ),
                    MediaObject(
                        "For Bigger Escape",
                        "https://dash.akamaized.net/dash264/TestCasesIOP33/adapatationSetSwitching/5/manifest.mpd",
                        "https://static.klliq.com/thumbnails/vGRpl-Xw45xfOCborXr3bwAsl0uu_qMA.png",
                        "Introducing Chromecast. The easiest way to enjoy online video and music on your TV—for when Batman's escapes aren't quite big enough. For \$35. Learn how to use Chromecast with Google Play Movies and more at google.com/chromecast."
                    ),
                    MediaObject(
                        "For Bigger Fun",
                        "https://livesim.dashif.org/livesim/chunkdur_1/ato_7/testpic4_8s/Manifest.mpd",
                        "https://websites.fraunhofer.de/video-dev/wp-content/uploads/2019/12/Bildschirmfoto-2019-12-04-um-16.45.30.png",
                        "Introducing Chromecast. The easiest way to enjoy online video and music on your TV. For \$35.  Find out more at google.com/chromecast."
                    )
                )
            )

            it.onComplete()
        }

        dataObservable.subscribe {
            data.value = it
        }.addTo(CompositeDisposable())

        return data
    }
}