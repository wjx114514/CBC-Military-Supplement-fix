package org.rassvet.cbc_military_supplement_fix;

import com.mojang.logging.LogUtils;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(CbcMilitarySupplementFix.MOD_ID)
public final class CbcMilitarySupplementFix {
    public static final String MOD_ID = "cbc_military_supplement_fix";
    private static final Logger LOGGER = LogUtils.getLogger();

    public CbcMilitarySupplementFix() {
        LOGGER.info("CBC Military Supplement duplicate sound registration fix is enabled");
    }

    public static void logSuppressedRegistration() {
        LOGGER.info("Suppressed CBC Military Supplement's duplicate sound-event registration");
    }
}
