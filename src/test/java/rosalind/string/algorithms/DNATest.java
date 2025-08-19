package rosalind.string.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DNATest {


    @Test
    void countingNucleotides() {

        String sequence1 = "AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC";
        String sequence2 = "ACGTACGTACGT";
        String sequence3 = "AAAACCCGGTTTTGGGGCCCCAAAATTTT";
        String seq1Result;
        String seq2Result;
        String seq3Result;

        DNA dnaQuestion = new DNA();
        seq1Result = dnaQuestion.countingNucleotides(sequence1);
        seq2Result = dnaQuestion.countingNucleotides(sequence2);
        seq3Result = dnaQuestion.countingNucleotides(sequence3);

        assertEquals("20 12 17 21", seq1Result);
        assertEquals("3 3 3 3", seq2Result);
        assertEquals("8 7 6 8", seq3Result);

    }
}