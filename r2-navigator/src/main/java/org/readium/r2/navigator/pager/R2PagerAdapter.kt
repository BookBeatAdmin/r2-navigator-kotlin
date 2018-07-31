/*
 * Module: r2-testapp-kotlin
 * Developers: Aferdita Muriqi, Clément Baumann
 *
 * Copyright (c) 2018. Readium Foundation. All rights reserved.
 * Use of this source code is governed by a BSD-style license which is detailed in the
 * LICENSE file present in the project repository where this source code is maintained.
 */

package org.readium.r2.navigator.pager

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import org.readium.r2.shared.Publication


class R2PagerAdapter(fm: FragmentManager, private val resources: List<String>, private val title: String, private val type: Publication.TYPE, private val publicationPath: String) : R2FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment =
            when (type) {
                Publication.TYPE.EPUB -> R2EpubPageFragment.newInstance(resources[position], title)
                Publication.TYPE.FXL -> R2EpubPageFragment.newInstance(resources[position], title)
                Publication.TYPE.CBZ -> R2CbzPageFragment.newInstance(publicationPath, resources[position])
            }

    override fun getCount(): Int {
        return resources.size
    }

}