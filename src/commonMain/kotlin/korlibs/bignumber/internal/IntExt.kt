package korlibs.bignumber.internal

// https://graphics.stanford.edu/~seander/bithacks.html#CountBitsSetParallel
internal fun Int.bitCount(): Int = countOneBits()

internal fun Int.trailingZeros(): Int = countTrailingZeroBits()

internal fun Int.leadingZeros(): Int = countLeadingZeroBits()
