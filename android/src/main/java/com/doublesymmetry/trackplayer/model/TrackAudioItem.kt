package com.doublesymmetry.trackplayer.model

import com.readwise.kotlinaudio.models.AudioItem
import com.readwise.kotlinaudio.models.AudioItemOptions
import com.readwise.kotlinaudio.models.MediaType

data class TrackAudioItem(
    val track: Track,
    override val type: MediaType,
    override var audioUrl: String,
    override var artist: String? = null,
    override var title: String? = null,
    override var albumTitle: String? = null,
    override val artwork: String? = null,
    override val duration: Long = -1,
    override val options: AudioItemOptions? = null
): AudioItem