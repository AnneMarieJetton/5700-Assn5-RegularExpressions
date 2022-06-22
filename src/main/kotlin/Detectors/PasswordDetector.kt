package Detectors

import Detector

class PasswordDetector(): Detector() {

    override fun DetectorType(): String {
        return "Binary"
    }
}