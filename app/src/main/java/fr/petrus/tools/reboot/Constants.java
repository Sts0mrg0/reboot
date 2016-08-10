/*
 *  Copyright Pierre Sagne (6 november 2012)
 *
 * petrus.dev.fr@gmail.com
 *
 * This software is a computer program whose purpose is to provide a reboot
 * menu for Android rooted devices.
 *
 * This software is governed by the CeCILL license under French law and
 * abiding by the rules of distribution of free software.  You can  use,
 * modify and/ or redistribute the software under the terms of the CeCILL
 * license as circulated by CEA, CNRS and INRIA at the following URL
 * "http://www.cecill.info".
 *
 * As a counterpart to the access to the source code and  rights to copy,
 * modify and redistribute granted by the license, users are provided only
 * with a limited warranty  and the software's author,  the holder of the
 * economic rights,  and the successive licensors  have only  limited
 * liability.
 *
 * In this respect, the user's attention is drawn to the risks associated
 * with loading,  using,  modifying and/or developing or reproducing the
 * software by the user in light of its specific status of free software,
 * that may mean  that it is complicated to manipulate,  and  that  also
 * therefore means  that it is reserved for developers  and  experienced
 * professionals having in-depth computer knowledge. Users are therefore
 * encouraged to load and test the software's suitability as regards their
 * requirements in conditions enabling the security of their systems and/or
 * data to be ensured and,  more generally, to use and operate it in the
 * same conditions as regards security.
 *
 * The fact that you are presently reading this means that you have had
 * knowledge of the CeCILL license and that you accept its terms.
 *
 */

package fr.petrus.tools.reboot;

/**
 * Keeps the app constants together.
 *
 * @author Pierre Sagne
 */
public interface Constants {
    int ARCH_UNKNOWN        = 0;
    int ARCH_ROCKCHIP_28    = 1;
    int ARCH_ROCKCHIP_29    = 2;
    int ARCH_ROCKCHIP_30    = 3;
    int ARCH_ROCKCHIP_31_KK = 4;
    int ARCH_ALLWINNER      = 5;
    int ARCH_ALLWINNER_GB   = 6;

    String REBOOT_RECOVERY_IMG_FILENAME = "misc_recovery.img";

    String OLD_APPLICATION_PACKAGE_NAME = "petrus.tools.ic_launcher_reboot";

    int DIALOG_NO_ROOT_ID           = 0;
    int DIALOG_REBOOT_ID            = 1;
    int DIALOG_SOFT_REBOOT_ID       = 2;
    int DIALOG_REBOOT_RECOVERY_ID   = 3;
    int DIALOG_REBOOT_BOOTLOADER_ID = 4;
    int DIALOG_REBOOT_DOWNLOAD_ID   = 5;
    int DIALOG_POWER_OFF_ID         = 6;
    int DIALOG_REMOVE_OLD_APP_ID    = 7;
}
