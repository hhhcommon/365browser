
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     gpu/ipc/common/gpu_info.mojom
//

package org.chromium.gpu.mojom;

import org.chromium.base.annotations.SuppressFBWarnings;
import org.chromium.mojo.bindings.DeserializationException;

public final class VideoCodecProfile {


    public static final int VIDEO_CODEC_PROFILE_UNKNOWN = (int) (-1L);

    public static final int H264_PROFILE_BASELINE = (int) (0L);

    public static final int H264_PROFILE_MAIN = H264_PROFILE_BASELINE + 1;

    public static final int H264_PROFILE_EXTENDED = H264_PROFILE_MAIN + 1;

    public static final int H264_PROFILE_HIGH = H264_PROFILE_EXTENDED + 1;

    public static final int H264_PROFILE_HIG_H10_PROFILE = H264_PROFILE_HIGH + 1;

    public static final int H264_PROFILE_HIG_H422_PROFILE = H264_PROFILE_HIG_H10_PROFILE + 1;

    public static final int H264_PROFILE_HIG_H444_PREDICTIVEPROFILE = H264_PROFILE_HIG_H422_PROFILE + 1;

    public static final int H264_PROFILE_SCALABLEBASELINE = H264_PROFILE_HIG_H444_PREDICTIVEPROFILE + 1;

    public static final int H264_PROFILE_SCALABLEHIGH = H264_PROFILE_SCALABLEBASELINE + 1;

    public static final int H264_PROFILE_STEREOHIGH = H264_PROFILE_SCALABLEHIGH + 1;

    public static final int H264_PROFILE_MULTIVIEWHIGH = H264_PROFILE_STEREOHIGH + 1;

    public static final int V_P8_PROFILE_ANY = H264_PROFILE_MULTIVIEWHIGH + 1;

    public static final int V_P9_PROFILE_PROFIL_E0 = V_P8_PROFILE_ANY + 1;

    public static final int V_P9_PROFILE_PROFIL_E1 = V_P9_PROFILE_PROFIL_E0 + 1;

    public static final int V_P9_PROFILE_PROFIL_E2 = V_P9_PROFILE_PROFIL_E1 + 1;

    public static final int V_P9_PROFILE_PROFIL_E3 = V_P9_PROFILE_PROFIL_E2 + 1;

    public static final int HEVCPROFILE_MAIN = V_P9_PROFILE_PROFIL_E3 + 1;

    public static final int HEVCPROFILE_MAI_N10 = HEVCPROFILE_MAIN + 1;

    public static final int HEVCPROFILE_MAIN_STILL_PICTURE = HEVCPROFILE_MAI_N10 + 1;

    public static final int DOLBYVISION_PROFIL_E0 = HEVCPROFILE_MAIN_STILL_PICTURE + 1;

    public static final int DOLBYVISION_PROFIL_E4 = DOLBYVISION_PROFIL_E0 + 1;

    public static final int DOLBYVISION_PROFIL_E5 = DOLBYVISION_PROFIL_E4 + 1;

    public static final int DOLBYVISION_PROFIL_E7 = DOLBYVISION_PROFIL_E5 + 1;


    private static final boolean IS_EXTENSIBLE = false;

    public static boolean isKnownValue(int value) {
        switch (value) {
            case -1:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                return true;
        }
        return false;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value))
            return;

        throw new DeserializationException("Invalid enum value.");
    }

    private VideoCodecProfile() {}

}