package Detectors

import Detector

class BinaryDetector(): Detector() {

    override fun DetectorType(): String {
        return "Binary"
    }
}