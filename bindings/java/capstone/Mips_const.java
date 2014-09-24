// For Capstone Engine. AUTO-GENERATED FILE, DO NOT EDIT
package capstone;

public class Mips_const {

	// Operand type for instruction's operands

	public static final int MIPS_OP_INVALID = 0;
	public static final int MIPS_OP_REG = 1;
	public static final int MIPS_OP_IMM = 2;
	public static final int MIPS_OP_MEM = 3;

	// MIPS registers

	public static final int MIPS_REG_INVALID = 0;

	// General purpose registers
	public static final int MIPS_REG_0 = 1;
	public static final int MIPS_REG_1 = 2;
	public static final int MIPS_REG_2 = 3;
	public static final int MIPS_REG_3 = 4;
	public static final int MIPS_REG_4 = 5;
	public static final int MIPS_REG_5 = 6;
	public static final int MIPS_REG_6 = 7;
	public static final int MIPS_REG_7 = 8;
	public static final int MIPS_REG_8 = 9;
	public static final int MIPS_REG_9 = 10;
	public static final int MIPS_REG_10 = 11;
	public static final int MIPS_REG_11 = 12;
	public static final int MIPS_REG_12 = 13;
	public static final int MIPS_REG_13 = 14;
	public static final int MIPS_REG_14 = 15;
	public static final int MIPS_REG_15 = 16;
	public static final int MIPS_REG_16 = 17;
	public static final int MIPS_REG_17 = 18;
	public static final int MIPS_REG_18 = 19;
	public static final int MIPS_REG_19 = 20;
	public static final int MIPS_REG_20 = 21;
	public static final int MIPS_REG_21 = 22;
	public static final int MIPS_REG_22 = 23;
	public static final int MIPS_REG_23 = 24;
	public static final int MIPS_REG_24 = 25;
	public static final int MIPS_REG_25 = 26;
	public static final int MIPS_REG_26 = 27;
	public static final int MIPS_REG_27 = 28;
	public static final int MIPS_REG_28 = 29;
	public static final int MIPS_REG_29 = 30;
	public static final int MIPS_REG_30 = 31;
	public static final int MIPS_REG_31 = 32;

	// DSP registers
	public static final int MIPS_REG_DSPCCOND = 33;
	public static final int MIPS_REG_DSPCARRY = 34;
	public static final int MIPS_REG_DSPEFI = 35;
	public static final int MIPS_REG_DSPOUTFLAG = 36;
	public static final int MIPS_REG_DSPOUTFLAG16_19 = 37;
	public static final int MIPS_REG_DSPOUTFLAG20 = 38;
	public static final int MIPS_REG_DSPOUTFLAG21 = 39;
	public static final int MIPS_REG_DSPOUTFLAG22 = 40;
	public static final int MIPS_REG_DSPOUTFLAG23 = 41;
	public static final int MIPS_REG_DSPPOS = 42;
	public static final int MIPS_REG_DSPSCOUNT = 43;

	// ACC registers
	public static final int MIPS_REG_AC0 = 44;
	public static final int MIPS_REG_AC1 = 45;
	public static final int MIPS_REG_AC2 = 46;
	public static final int MIPS_REG_AC3 = 47;

	// COP registers
	public static final int MIPS_REG_CC0 = 48;
	public static final int MIPS_REG_CC1 = 49;
	public static final int MIPS_REG_CC2 = 50;
	public static final int MIPS_REG_CC3 = 51;
	public static final int MIPS_REG_CC4 = 52;
	public static final int MIPS_REG_CC5 = 53;
	public static final int MIPS_REG_CC6 = 54;
	public static final int MIPS_REG_CC7 = 55;

	// FPU registers
	public static final int MIPS_REG_F0 = 56;
	public static final int MIPS_REG_F1 = 57;
	public static final int MIPS_REG_F2 = 58;
	public static final int MIPS_REG_F3 = 59;
	public static final int MIPS_REG_F4 = 60;
	public static final int MIPS_REG_F5 = 61;
	public static final int MIPS_REG_F6 = 62;
	public static final int MIPS_REG_F7 = 63;
	public static final int MIPS_REG_F8 = 64;
	public static final int MIPS_REG_F9 = 65;
	public static final int MIPS_REG_F10 = 66;
	public static final int MIPS_REG_F11 = 67;
	public static final int MIPS_REG_F12 = 68;
	public static final int MIPS_REG_F13 = 69;
	public static final int MIPS_REG_F14 = 70;
	public static final int MIPS_REG_F15 = 71;
	public static final int MIPS_REG_F16 = 72;
	public static final int MIPS_REG_F17 = 73;
	public static final int MIPS_REG_F18 = 74;
	public static final int MIPS_REG_F19 = 75;
	public static final int MIPS_REG_F20 = 76;
	public static final int MIPS_REG_F21 = 77;
	public static final int MIPS_REG_F22 = 78;
	public static final int MIPS_REG_F23 = 79;
	public static final int MIPS_REG_F24 = 80;
	public static final int MIPS_REG_F25 = 81;
	public static final int MIPS_REG_F26 = 82;
	public static final int MIPS_REG_F27 = 83;
	public static final int MIPS_REG_F28 = 84;
	public static final int MIPS_REG_F29 = 85;
	public static final int MIPS_REG_F30 = 86;
	public static final int MIPS_REG_F31 = 87;
	public static final int MIPS_REG_FCC0 = 88;
	public static final int MIPS_REG_FCC1 = 89;
	public static final int MIPS_REG_FCC2 = 90;
	public static final int MIPS_REG_FCC3 = 91;
	public static final int MIPS_REG_FCC4 = 92;
	public static final int MIPS_REG_FCC5 = 93;
	public static final int MIPS_REG_FCC6 = 94;
	public static final int MIPS_REG_FCC7 = 95;

	// AFPR128
	public static final int MIPS_REG_W0 = 96;
	public static final int MIPS_REG_W1 = 97;
	public static final int MIPS_REG_W2 = 98;
	public static final int MIPS_REG_W3 = 99;
	public static final int MIPS_REG_W4 = 100;
	public static final int MIPS_REG_W5 = 101;
	public static final int MIPS_REG_W6 = 102;
	public static final int MIPS_REG_W7 = 103;
	public static final int MIPS_REG_W8 = 104;
	public static final int MIPS_REG_W9 = 105;
	public static final int MIPS_REG_W10 = 106;
	public static final int MIPS_REG_W11 = 107;
	public static final int MIPS_REG_W12 = 108;
	public static final int MIPS_REG_W13 = 109;
	public static final int MIPS_REG_W14 = 110;
	public static final int MIPS_REG_W15 = 111;
	public static final int MIPS_REG_W16 = 112;
	public static final int MIPS_REG_W17 = 113;
	public static final int MIPS_REG_W18 = 114;
	public static final int MIPS_REG_W19 = 115;
	public static final int MIPS_REG_W20 = 116;
	public static final int MIPS_REG_W21 = 117;
	public static final int MIPS_REG_W22 = 118;
	public static final int MIPS_REG_W23 = 119;
	public static final int MIPS_REG_W24 = 120;
	public static final int MIPS_REG_W25 = 121;
	public static final int MIPS_REG_W26 = 122;
	public static final int MIPS_REG_W27 = 123;
	public static final int MIPS_REG_W28 = 124;
	public static final int MIPS_REG_W29 = 125;
	public static final int MIPS_REG_W30 = 126;
	public static final int MIPS_REG_W31 = 127;
	public static final int MIPS_REG_HI = 128;
	public static final int MIPS_REG_LO = 129;
	public static final int MIPS_REG_PC = 130;
	public static final int MIPS_REG_P0 = 131;
	public static final int MIPS_REG_P1 = 132;
	public static final int MIPS_REG_P2 = 133;
	public static final int MIPS_REG_MPL0 = 134;
	public static final int MIPS_REG_MPL1 = 135;
	public static final int MIPS_REG_MPL2 = 136;
	public static final int MIPS_REG_MAX = 137;
	public static final int MIPS_REG_ZERO = MIPS_REG_0;
	public static final int MIPS_REG_AT = MIPS_REG_1;
	public static final int MIPS_REG_V0 = MIPS_REG_2;
	public static final int MIPS_REG_V1 = MIPS_REG_3;
	public static final int MIPS_REG_A0 = MIPS_REG_4;
	public static final int MIPS_REG_A1 = MIPS_REG_5;
	public static final int MIPS_REG_A2 = MIPS_REG_6;
	public static final int MIPS_REG_A3 = MIPS_REG_7;
	public static final int MIPS_REG_T0 = MIPS_REG_8;
	public static final int MIPS_REG_T1 = MIPS_REG_9;
	public static final int MIPS_REG_T2 = MIPS_REG_10;
	public static final int MIPS_REG_T3 = MIPS_REG_11;
	public static final int MIPS_REG_T4 = MIPS_REG_12;
	public static final int MIPS_REG_T5 = MIPS_REG_13;
	public static final int MIPS_REG_T6 = MIPS_REG_14;
	public static final int MIPS_REG_T7 = MIPS_REG_15;
	public static final int MIPS_REG_S0 = MIPS_REG_16;
	public static final int MIPS_REG_S1 = MIPS_REG_17;
	public static final int MIPS_REG_S2 = MIPS_REG_18;
	public static final int MIPS_REG_S3 = MIPS_REG_19;
	public static final int MIPS_REG_S4 = MIPS_REG_20;
	public static final int MIPS_REG_S5 = MIPS_REG_21;
	public static final int MIPS_REG_S6 = MIPS_REG_22;
	public static final int MIPS_REG_S7 = MIPS_REG_23;
	public static final int MIPS_REG_T8 = MIPS_REG_24;
	public static final int MIPS_REG_T9 = MIPS_REG_25;
	public static final int MIPS_REG_K0 = MIPS_REG_26;
	public static final int MIPS_REG_K1 = MIPS_REG_27;
	public static final int MIPS_REG_GP = MIPS_REG_28;
	public static final int MIPS_REG_SP = MIPS_REG_29;
	public static final int MIPS_REG_FP = MIPS_REG_30;
	public static final int MIPS_REG_S8 = MIPS_REG_30;
	public static final int MIPS_REG_RA = MIPS_REG_31;
	public static final int MIPS_REG_HI0 = MIPS_REG_AC0;
	public static final int MIPS_REG_HI1 = MIPS_REG_AC1;
	public static final int MIPS_REG_HI2 = MIPS_REG_AC2;
	public static final int MIPS_REG_HI3 = MIPS_REG_AC3;
	public static final int MIPS_REG_LO0 = MIPS_REG_HI0;
	public static final int MIPS_REG_LO1 = MIPS_REG_HI1;
	public static final int MIPS_REG_LO2 = MIPS_REG_HI2;
	public static final int MIPS_REG_LO3 = MIPS_REG_HI3;

	// MIPS instruction

	public static final int MIPS_INS_INVALID = 0;
	public static final int MIPS_INS_ABSQ_S = 1;
	public static final int MIPS_INS_ADD = 2;
	public static final int MIPS_INS_ADDIUPC = 3;
	public static final int MIPS_INS_ADDQH = 4;
	public static final int MIPS_INS_ADDQH_R = 5;
	public static final int MIPS_INS_ADDQ = 6;
	public static final int MIPS_INS_ADDQ_S = 7;
	public static final int MIPS_INS_ADDSC = 8;
	public static final int MIPS_INS_ADDS_A = 9;
	public static final int MIPS_INS_ADDS_S = 10;
	public static final int MIPS_INS_ADDS_U = 11;
	public static final int MIPS_INS_ADDUH = 12;
	public static final int MIPS_INS_ADDUH_R = 13;
	public static final int MIPS_INS_ADDU = 14;
	public static final int MIPS_INS_ADDU_S = 15;
	public static final int MIPS_INS_ADDVI = 16;
	public static final int MIPS_INS_ADDV = 17;
	public static final int MIPS_INS_ADDWC = 18;
	public static final int MIPS_INS_ADD_A = 19;
	public static final int MIPS_INS_ADDI = 20;
	public static final int MIPS_INS_ADDIU = 21;
	public static final int MIPS_INS_ALIGN = 22;
	public static final int MIPS_INS_ALUIPC = 23;
	public static final int MIPS_INS_AND = 24;
	public static final int MIPS_INS_ANDI = 25;
	public static final int MIPS_INS_APPEND = 26;
	public static final int MIPS_INS_ASUB_S = 27;
	public static final int MIPS_INS_ASUB_U = 28;
	public static final int MIPS_INS_AUI = 29;
	public static final int MIPS_INS_AUIPC = 30;
	public static final int MIPS_INS_AVER_S = 31;
	public static final int MIPS_INS_AVER_U = 32;
	public static final int MIPS_INS_AVE_S = 33;
	public static final int MIPS_INS_AVE_U = 34;
	public static final int MIPS_INS_BADDU = 35;
	public static final int MIPS_INS_BAL = 36;
	public static final int MIPS_INS_BALC = 37;
	public static final int MIPS_INS_BALIGN = 38;
	public static final int MIPS_INS_BC = 39;
	public static final int MIPS_INS_BC0F = 40;
	public static final int MIPS_INS_BC0FL = 41;
	public static final int MIPS_INS_BC0T = 42;
	public static final int MIPS_INS_BC0TL = 43;
	public static final int MIPS_INS_BC1EQZ = 44;
	public static final int MIPS_INS_BC1F = 45;
	public static final int MIPS_INS_BC1FL = 46;
	public static final int MIPS_INS_BC1NEZ = 47;
	public static final int MIPS_INS_BC1T = 48;
	public static final int MIPS_INS_BC1TL = 49;
	public static final int MIPS_INS_BC2EQZ = 50;
	public static final int MIPS_INS_BC2F = 51;
	public static final int MIPS_INS_BC2FL = 52;
	public static final int MIPS_INS_BC2NEZ = 53;
	public static final int MIPS_INS_BC2T = 54;
	public static final int MIPS_INS_BC2TL = 55;
	public static final int MIPS_INS_BC3F = 56;
	public static final int MIPS_INS_BC3FL = 57;
	public static final int MIPS_INS_BC3T = 58;
	public static final int MIPS_INS_BC3TL = 59;
	public static final int MIPS_INS_BCLRI = 60;
	public static final int MIPS_INS_BCLR = 61;
	public static final int MIPS_INS_BEQ = 62;
	public static final int MIPS_INS_BEQC = 63;
	public static final int MIPS_INS_BEQL = 64;
	public static final int MIPS_INS_BEQZALC = 65;
	public static final int MIPS_INS_BEQZC = 66;
	public static final int MIPS_INS_BGEC = 67;
	public static final int MIPS_INS_BGEUC = 68;
	public static final int MIPS_INS_BGEZ = 69;
	public static final int MIPS_INS_BGEZAL = 70;
	public static final int MIPS_INS_BGEZALC = 71;
	public static final int MIPS_INS_BGEZALL = 72;
	public static final int MIPS_INS_BGEZALS = 73;
	public static final int MIPS_INS_BGEZC = 74;
	public static final int MIPS_INS_BGEZL = 75;
	public static final int MIPS_INS_BGTZ = 76;
	public static final int MIPS_INS_BGTZALC = 77;
	public static final int MIPS_INS_BGTZC = 78;
	public static final int MIPS_INS_BGTZL = 79;
	public static final int MIPS_INS_BINSLI = 80;
	public static final int MIPS_INS_BINSL = 81;
	public static final int MIPS_INS_BINSRI = 82;
	public static final int MIPS_INS_BINSR = 83;
	public static final int MIPS_INS_BITREV = 84;
	public static final int MIPS_INS_BITSWAP = 85;
	public static final int MIPS_INS_BLEZ = 86;
	public static final int MIPS_INS_BLEZALC = 87;
	public static final int MIPS_INS_BLEZC = 88;
	public static final int MIPS_INS_BLEZL = 89;
	public static final int MIPS_INS_BLTC = 90;
	public static final int MIPS_INS_BLTUC = 91;
	public static final int MIPS_INS_BLTZ = 92;
	public static final int MIPS_INS_BLTZAL = 93;
	public static final int MIPS_INS_BLTZALC = 94;
	public static final int MIPS_INS_BLTZALL = 95;
	public static final int MIPS_INS_BLTZALS = 96;
	public static final int MIPS_INS_BLTZC = 97;
	public static final int MIPS_INS_BLTZL = 98;
	public static final int MIPS_INS_BMNZI = 99;
	public static final int MIPS_INS_BMNZ = 100;
	public static final int MIPS_INS_BMZI = 101;
	public static final int MIPS_INS_BMZ = 102;
	public static final int MIPS_INS_BNE = 103;
	public static final int MIPS_INS_BNEC = 104;
	public static final int MIPS_INS_BNEGI = 105;
	public static final int MIPS_INS_BNEG = 106;
	public static final int MIPS_INS_BNEL = 107;
	public static final int MIPS_INS_BNEZALC = 108;
	public static final int MIPS_INS_BNEZC = 109;
	public static final int MIPS_INS_BNVC = 110;
	public static final int MIPS_INS_BNZ = 111;
	public static final int MIPS_INS_BOVC = 112;
	public static final int MIPS_INS_BPOSGE32 = 113;
	public static final int MIPS_INS_BREAK = 114;
	public static final int MIPS_INS_BSELI = 115;
	public static final int MIPS_INS_BSEL = 116;
	public static final int MIPS_INS_BSETI = 117;
	public static final int MIPS_INS_BSET = 118;
	public static final int MIPS_INS_BZ = 119;
	public static final int MIPS_INS_BEQZ = 120;
	public static final int MIPS_INS_B = 121;
	public static final int MIPS_INS_BNEZ = 122;
	public static final int MIPS_INS_BTEQZ = 123;
	public static final int MIPS_INS_BTNEZ = 124;
	public static final int MIPS_INS_CACHE = 125;
	public static final int MIPS_INS_CEIL = 126;
	public static final int MIPS_INS_CEQI = 127;
	public static final int MIPS_INS_CEQ = 128;
	public static final int MIPS_INS_CFC1 = 129;
	public static final int MIPS_INS_CFCMSA = 130;
	public static final int MIPS_INS_CINS = 131;
	public static final int MIPS_INS_CINS32 = 132;
	public static final int MIPS_INS_CLASS = 133;
	public static final int MIPS_INS_CLEI_S = 134;
	public static final int MIPS_INS_CLEI_U = 135;
	public static final int MIPS_INS_CLE_S = 136;
	public static final int MIPS_INS_CLE_U = 137;
	public static final int MIPS_INS_CLO = 138;
	public static final int MIPS_INS_CLTI_S = 139;
	public static final int MIPS_INS_CLTI_U = 140;
	public static final int MIPS_INS_CLT_S = 141;
	public static final int MIPS_INS_CLT_U = 142;
	public static final int MIPS_INS_CLZ = 143;
	public static final int MIPS_INS_CMPGDU = 144;
	public static final int MIPS_INS_CMPGU = 145;
	public static final int MIPS_INS_CMPU = 146;
	public static final int MIPS_INS_CMP = 147;
	public static final int MIPS_INS_COPY_S = 148;
	public static final int MIPS_INS_COPY_U = 149;
	public static final int MIPS_INS_CTC1 = 150;
	public static final int MIPS_INS_CTCMSA = 151;
	public static final int MIPS_INS_CVT = 152;
	public static final int MIPS_INS_C = 153;
	public static final int MIPS_INS_CMPI = 154;
	public static final int MIPS_INS_DADD = 155;
	public static final int MIPS_INS_DADDI = 156;
	public static final int MIPS_INS_DADDIU = 157;
	public static final int MIPS_INS_DADDU = 158;
	public static final int MIPS_INS_DAHI = 159;
	public static final int MIPS_INS_DALIGN = 160;
	public static final int MIPS_INS_DATI = 161;
	public static final int MIPS_INS_DAUI = 162;
	public static final int MIPS_INS_DBITSWAP = 163;
	public static final int MIPS_INS_DCLO = 164;
	public static final int MIPS_INS_DCLZ = 165;
	public static final int MIPS_INS_DDIV = 166;
	public static final int MIPS_INS_DDIVU = 167;
	public static final int MIPS_INS_DERET = 168;
	public static final int MIPS_INS_DEXT = 169;
	public static final int MIPS_INS_DEXTM = 170;
	public static final int MIPS_INS_DEXTU = 171;
	public static final int MIPS_INS_DI = 172;
	public static final int MIPS_INS_DINS = 173;
	public static final int MIPS_INS_DINSM = 174;
	public static final int MIPS_INS_DINSU = 175;
	public static final int MIPS_INS_DIV = 176;
	public static final int MIPS_INS_DIVU = 177;
	public static final int MIPS_INS_DIV_S = 178;
	public static final int MIPS_INS_DIV_U = 179;
	public static final int MIPS_INS_DLSA = 180;
	public static final int MIPS_INS_DMFC0 = 181;
	public static final int MIPS_INS_DMFC1 = 182;
	public static final int MIPS_INS_DMFC2 = 183;
	public static final int MIPS_INS_DMOD = 184;
	public static final int MIPS_INS_DMODU = 185;
	public static final int MIPS_INS_DMTC0 = 186;
	public static final int MIPS_INS_DMTC1 = 187;
	public static final int MIPS_INS_DMTC2 = 188;
	public static final int MIPS_INS_DMUH = 189;
	public static final int MIPS_INS_DMUHU = 190;
	public static final int MIPS_INS_DMUL = 191;
	public static final int MIPS_INS_DMULT = 192;
	public static final int MIPS_INS_DMULTU = 193;
	public static final int MIPS_INS_DMULU = 194;
	public static final int MIPS_INS_DOTP_S = 195;
	public static final int MIPS_INS_DOTP_U = 196;
	public static final int MIPS_INS_DPADD_S = 197;
	public static final int MIPS_INS_DPADD_U = 198;
	public static final int MIPS_INS_DPAQX_SA = 199;
	public static final int MIPS_INS_DPAQX_S = 200;
	public static final int MIPS_INS_DPAQ_SA = 201;
	public static final int MIPS_INS_DPAQ_S = 202;
	public static final int MIPS_INS_DPAU = 203;
	public static final int MIPS_INS_DPAX = 204;
	public static final int MIPS_INS_DPA = 205;
	public static final int MIPS_INS_DPOP = 206;
	public static final int MIPS_INS_DPSQX_SA = 207;
	public static final int MIPS_INS_DPSQX_S = 208;
	public static final int MIPS_INS_DPSQ_SA = 209;
	public static final int MIPS_INS_DPSQ_S = 210;
	public static final int MIPS_INS_DPSUB_S = 211;
	public static final int MIPS_INS_DPSUB_U = 212;
	public static final int MIPS_INS_DPSU = 213;
	public static final int MIPS_INS_DPSX = 214;
	public static final int MIPS_INS_DPS = 215;
	public static final int MIPS_INS_DROTR = 216;
	public static final int MIPS_INS_DROTR32 = 217;
	public static final int MIPS_INS_DROTRV = 218;
	public static final int MIPS_INS_DSBH = 219;
	public static final int MIPS_INS_DSHD = 220;
	public static final int MIPS_INS_DSLL = 221;
	public static final int MIPS_INS_DSLL32 = 222;
	public static final int MIPS_INS_DSLLV = 223;
	public static final int MIPS_INS_DSRA = 224;
	public static final int MIPS_INS_DSRA32 = 225;
	public static final int MIPS_INS_DSRAV = 226;
	public static final int MIPS_INS_DSRL = 227;
	public static final int MIPS_INS_DSRL32 = 228;
	public static final int MIPS_INS_DSRLV = 229;
	public static final int MIPS_INS_DSUB = 230;
	public static final int MIPS_INS_DSUBU = 231;
	public static final int MIPS_INS_EHB = 232;
	public static final int MIPS_INS_EI = 233;
	public static final int MIPS_INS_ERET = 234;
	public static final int MIPS_INS_EXT = 235;
	public static final int MIPS_INS_EXTP = 236;
	public static final int MIPS_INS_EXTPDP = 237;
	public static final int MIPS_INS_EXTPDPV = 238;
	public static final int MIPS_INS_EXTPV = 239;
	public static final int MIPS_INS_EXTRV_RS = 240;
	public static final int MIPS_INS_EXTRV_R = 241;
	public static final int MIPS_INS_EXTRV_S = 242;
	public static final int MIPS_INS_EXTRV = 243;
	public static final int MIPS_INS_EXTR_RS = 244;
	public static final int MIPS_INS_EXTR_R = 245;
	public static final int MIPS_INS_EXTR_S = 246;
	public static final int MIPS_INS_EXTR = 247;
	public static final int MIPS_INS_EXTS = 248;
	public static final int MIPS_INS_EXTS32 = 249;
	public static final int MIPS_INS_ABS = 250;
	public static final int MIPS_INS_FADD = 251;
	public static final int MIPS_INS_FCAF = 252;
	public static final int MIPS_INS_FCEQ = 253;
	public static final int MIPS_INS_FCLASS = 254;
	public static final int MIPS_INS_FCLE = 255;
	public static final int MIPS_INS_FCLT = 256;
	public static final int MIPS_INS_FCNE = 257;
	public static final int MIPS_INS_FCOR = 258;
	public static final int MIPS_INS_FCUEQ = 259;
	public static final int MIPS_INS_FCULE = 260;
	public static final int MIPS_INS_FCULT = 261;
	public static final int MIPS_INS_FCUNE = 262;
	public static final int MIPS_INS_FCUN = 263;
	public static final int MIPS_INS_FDIV = 264;
	public static final int MIPS_INS_FEXDO = 265;
	public static final int MIPS_INS_FEXP2 = 266;
	public static final int MIPS_INS_FEXUPL = 267;
	public static final int MIPS_INS_FEXUPR = 268;
	public static final int MIPS_INS_FFINT_S = 269;
	public static final int MIPS_INS_FFINT_U = 270;
	public static final int MIPS_INS_FFQL = 271;
	public static final int MIPS_INS_FFQR = 272;
	public static final int MIPS_INS_FILL = 273;
	public static final int MIPS_INS_FLOG2 = 274;
	public static final int MIPS_INS_FLOOR = 275;
	public static final int MIPS_INS_FMADD = 276;
	public static final int MIPS_INS_FMAX_A = 277;
	public static final int MIPS_INS_FMAX = 278;
	public static final int MIPS_INS_FMIN_A = 279;
	public static final int MIPS_INS_FMIN = 280;
	public static final int MIPS_INS_MOV = 281;
	public static final int MIPS_INS_FMSUB = 282;
	public static final int MIPS_INS_FMUL = 283;
	public static final int MIPS_INS_MUL = 284;
	public static final int MIPS_INS_NEG = 285;
	public static final int MIPS_INS_FRCP = 286;
	public static final int MIPS_INS_FRINT = 287;
	public static final int MIPS_INS_FRSQRT = 288;
	public static final int MIPS_INS_FSAF = 289;
	public static final int MIPS_INS_FSEQ = 290;
	public static final int MIPS_INS_FSLE = 291;
	public static final int MIPS_INS_FSLT = 292;
	public static final int MIPS_INS_FSNE = 293;
	public static final int MIPS_INS_FSOR = 294;
	public static final int MIPS_INS_FSQRT = 295;
	public static final int MIPS_INS_SQRT = 296;
	public static final int MIPS_INS_FSUB = 297;
	public static final int MIPS_INS_SUB = 298;
	public static final int MIPS_INS_FSUEQ = 299;
	public static final int MIPS_INS_FSULE = 300;
	public static final int MIPS_INS_FSULT = 301;
	public static final int MIPS_INS_FSUNE = 302;
	public static final int MIPS_INS_FSUN = 303;
	public static final int MIPS_INS_FTINT_S = 304;
	public static final int MIPS_INS_FTINT_U = 305;
	public static final int MIPS_INS_FTQ = 306;
	public static final int MIPS_INS_FTRUNC_S = 307;
	public static final int MIPS_INS_FTRUNC_U = 308;
	public static final int MIPS_INS_HADD_S = 309;
	public static final int MIPS_INS_HADD_U = 310;
	public static final int MIPS_INS_HSUB_S = 311;
	public static final int MIPS_INS_HSUB_U = 312;
	public static final int MIPS_INS_ILVEV = 313;
	public static final int MIPS_INS_ILVL = 314;
	public static final int MIPS_INS_ILVOD = 315;
	public static final int MIPS_INS_ILVR = 316;
	public static final int MIPS_INS_INS = 317;
	public static final int MIPS_INS_INSERT = 318;
	public static final int MIPS_INS_INSV = 319;
	public static final int MIPS_INS_INSVE = 320;
	public static final int MIPS_INS_J = 321;
	public static final int MIPS_INS_JAL = 322;
	public static final int MIPS_INS_JALR = 323;
	public static final int MIPS_INS_JALRS = 324;
	public static final int MIPS_INS_JALS = 325;
	public static final int MIPS_INS_JALX = 326;
	public static final int MIPS_INS_JIALC = 327;
	public static final int MIPS_INS_JIC = 328;
	public static final int MIPS_INS_JR = 329;
	public static final int MIPS_INS_JRADDIUSP = 330;
	public static final int MIPS_INS_JRC = 331;
	public static final int MIPS_INS_JALRC = 332;
	public static final int MIPS_INS_LB = 333;
	public static final int MIPS_INS_LBUX = 334;
	public static final int MIPS_INS_LBU = 335;
	public static final int MIPS_INS_LD = 336;
	public static final int MIPS_INS_LDC1 = 337;
	public static final int MIPS_INS_LDC2 = 338;
	public static final int MIPS_INS_LDC3 = 339;
	public static final int MIPS_INS_LDI = 340;
	public static final int MIPS_INS_LDL = 341;
	public static final int MIPS_INS_LDPC = 342;
	public static final int MIPS_INS_LDR = 343;
	public static final int MIPS_INS_LDXC1 = 344;
	public static final int MIPS_INS_LH = 345;
	public static final int MIPS_INS_LHX = 346;
	public static final int MIPS_INS_LHU = 347;
	public static final int MIPS_INS_LL = 348;
	public static final int MIPS_INS_LLD = 349;
	public static final int MIPS_INS_LSA = 350;
	public static final int MIPS_INS_LUXC1 = 351;
	public static final int MIPS_INS_LUI = 352;
	public static final int MIPS_INS_LW = 353;
	public static final int MIPS_INS_LWC1 = 354;
	public static final int MIPS_INS_LWC2 = 355;
	public static final int MIPS_INS_LWC3 = 356;
	public static final int MIPS_INS_LWL = 357;
	public static final int MIPS_INS_LWPC = 358;
	public static final int MIPS_INS_LWR = 359;
	public static final int MIPS_INS_LWUPC = 360;
	public static final int MIPS_INS_LWU = 361;
	public static final int MIPS_INS_LWX = 362;
	public static final int MIPS_INS_LWXC1 = 363;
	public static final int MIPS_INS_LI = 364;
	public static final int MIPS_INS_MADD = 365;
	public static final int MIPS_INS_MADDF = 366;
	public static final int MIPS_INS_MADDR_Q = 367;
	public static final int MIPS_INS_MADDU = 368;
	public static final int MIPS_INS_MADDV = 369;
	public static final int MIPS_INS_MADD_Q = 370;
	public static final int MIPS_INS_MAQ_SA = 371;
	public static final int MIPS_INS_MAQ_S = 372;
	public static final int MIPS_INS_MAXA = 373;
	public static final int MIPS_INS_MAXI_S = 374;
	public static final int MIPS_INS_MAXI_U = 375;
	public static final int MIPS_INS_MAX_A = 376;
	public static final int MIPS_INS_MAX = 377;
	public static final int MIPS_INS_MAX_S = 378;
	public static final int MIPS_INS_MAX_U = 379;
	public static final int MIPS_INS_MFC0 = 380;
	public static final int MIPS_INS_MFC1 = 381;
	public static final int MIPS_INS_MFC2 = 382;
	public static final int MIPS_INS_MFHC1 = 383;
	public static final int MIPS_INS_MFHI = 384;
	public static final int MIPS_INS_MFLO = 385;
	public static final int MIPS_INS_MINA = 386;
	public static final int MIPS_INS_MINI_S = 387;
	public static final int MIPS_INS_MINI_U = 388;
	public static final int MIPS_INS_MIN_A = 389;
	public static final int MIPS_INS_MIN = 390;
	public static final int MIPS_INS_MIN_S = 391;
	public static final int MIPS_INS_MIN_U = 392;
	public static final int MIPS_INS_MOD = 393;
	public static final int MIPS_INS_MODSUB = 394;
	public static final int MIPS_INS_MODU = 395;
	public static final int MIPS_INS_MOD_S = 396;
	public static final int MIPS_INS_MOD_U = 397;
	public static final int MIPS_INS_MOVE = 398;
	public static final int MIPS_INS_MOVF = 399;
	public static final int MIPS_INS_MOVN = 400;
	public static final int MIPS_INS_MOVT = 401;
	public static final int MIPS_INS_MOVZ = 402;
	public static final int MIPS_INS_MSUB = 403;
	public static final int MIPS_INS_MSUBF = 404;
	public static final int MIPS_INS_MSUBR_Q = 405;
	public static final int MIPS_INS_MSUBU = 406;
	public static final int MIPS_INS_MSUBV = 407;
	public static final int MIPS_INS_MSUB_Q = 408;
	public static final int MIPS_INS_MTC0 = 409;
	public static final int MIPS_INS_MTC1 = 410;
	public static final int MIPS_INS_MTC2 = 411;
	public static final int MIPS_INS_MTHC1 = 412;
	public static final int MIPS_INS_MTHI = 413;
	public static final int MIPS_INS_MTHLIP = 414;
	public static final int MIPS_INS_MTLO = 415;
	public static final int MIPS_INS_MTM0 = 416;
	public static final int MIPS_INS_MTM1 = 417;
	public static final int MIPS_INS_MTM2 = 418;
	public static final int MIPS_INS_MTP0 = 419;
	public static final int MIPS_INS_MTP1 = 420;
	public static final int MIPS_INS_MTP2 = 421;
	public static final int MIPS_INS_MUH = 422;
	public static final int MIPS_INS_MUHU = 423;
	public static final int MIPS_INS_MULEQ_S = 424;
	public static final int MIPS_INS_MULEU_S = 425;
	public static final int MIPS_INS_MULQ_RS = 426;
	public static final int MIPS_INS_MULQ_S = 427;
	public static final int MIPS_INS_MULR_Q = 428;
	public static final int MIPS_INS_MULSAQ_S = 429;
	public static final int MIPS_INS_MULSA = 430;
	public static final int MIPS_INS_MULT = 431;
	public static final int MIPS_INS_MULTU = 432;
	public static final int MIPS_INS_MULU = 433;
	public static final int MIPS_INS_MULV = 434;
	public static final int MIPS_INS_MUL_Q = 435;
	public static final int MIPS_INS_MUL_S = 436;
	public static final int MIPS_INS_NLOC = 437;
	public static final int MIPS_INS_NLZC = 438;
	public static final int MIPS_INS_NMADD = 439;
	public static final int MIPS_INS_NMSUB = 440;
	public static final int MIPS_INS_NOR = 441;
	public static final int MIPS_INS_NORI = 442;
	public static final int MIPS_INS_NOT = 443;
	public static final int MIPS_INS_OR = 444;
	public static final int MIPS_INS_ORI = 445;
	public static final int MIPS_INS_PACKRL = 446;
	public static final int MIPS_INS_PAUSE = 447;
	public static final int MIPS_INS_PCKEV = 448;
	public static final int MIPS_INS_PCKOD = 449;
	public static final int MIPS_INS_PCNT = 450;
	public static final int MIPS_INS_PICK = 451;
	public static final int MIPS_INS_POP = 452;
	public static final int MIPS_INS_PRECEQU = 453;
	public static final int MIPS_INS_PRECEQ = 454;
	public static final int MIPS_INS_PRECEU = 455;
	public static final int MIPS_INS_PRECRQU_S = 456;
	public static final int MIPS_INS_PRECRQ = 457;
	public static final int MIPS_INS_PRECRQ_RS = 458;
	public static final int MIPS_INS_PRECR = 459;
	public static final int MIPS_INS_PRECR_SRA = 460;
	public static final int MIPS_INS_PRECR_SRA_R = 461;
	public static final int MIPS_INS_PREF = 462;
	public static final int MIPS_INS_PREPEND = 463;
	public static final int MIPS_INS_RADDU = 464;
	public static final int MIPS_INS_RDDSP = 465;
	public static final int MIPS_INS_RDHWR = 466;
	public static final int MIPS_INS_REPLV = 467;
	public static final int MIPS_INS_REPL = 468;
	public static final int MIPS_INS_RINT = 469;
	public static final int MIPS_INS_ROTR = 470;
	public static final int MIPS_INS_ROTRV = 471;
	public static final int MIPS_INS_ROUND = 472;
	public static final int MIPS_INS_SAT_S = 473;
	public static final int MIPS_INS_SAT_U = 474;
	public static final int MIPS_INS_SB = 475;
	public static final int MIPS_INS_SC = 476;
	public static final int MIPS_INS_SCD = 477;
	public static final int MIPS_INS_SD = 478;
	public static final int MIPS_INS_SDBBP = 479;
	public static final int MIPS_INS_SDC1 = 480;
	public static final int MIPS_INS_SDC2 = 481;
	public static final int MIPS_INS_SDC3 = 482;
	public static final int MIPS_INS_SDL = 483;
	public static final int MIPS_INS_SDR = 484;
	public static final int MIPS_INS_SDXC1 = 485;
	public static final int MIPS_INS_SEB = 486;
	public static final int MIPS_INS_SEH = 487;
	public static final int MIPS_INS_SELEQZ = 488;
	public static final int MIPS_INS_SELNEZ = 489;
	public static final int MIPS_INS_SEL = 490;
	public static final int MIPS_INS_SEQ = 491;
	public static final int MIPS_INS_SEQI = 492;
	public static final int MIPS_INS_SH = 493;
	public static final int MIPS_INS_SHF = 494;
	public static final int MIPS_INS_SHILO = 495;
	public static final int MIPS_INS_SHILOV = 496;
	public static final int MIPS_INS_SHLLV = 497;
	public static final int MIPS_INS_SHLLV_S = 498;
	public static final int MIPS_INS_SHLL = 499;
	public static final int MIPS_INS_SHLL_S = 500;
	public static final int MIPS_INS_SHRAV = 501;
	public static final int MIPS_INS_SHRAV_R = 502;
	public static final int MIPS_INS_SHRA = 503;
	public static final int MIPS_INS_SHRA_R = 504;
	public static final int MIPS_INS_SHRLV = 505;
	public static final int MIPS_INS_SHRL = 506;
	public static final int MIPS_INS_SLDI = 507;
	public static final int MIPS_INS_SLD = 508;
	public static final int MIPS_INS_SLL = 509;
	public static final int MIPS_INS_SLLI = 510;
	public static final int MIPS_INS_SLLV = 511;
	public static final int MIPS_INS_SLT = 512;
	public static final int MIPS_INS_SLTI = 513;
	public static final int MIPS_INS_SLTIU = 514;
	public static final int MIPS_INS_SLTU = 515;
	public static final int MIPS_INS_SNE = 516;
	public static final int MIPS_INS_SNEI = 517;
	public static final int MIPS_INS_SPLATI = 518;
	public static final int MIPS_INS_SPLAT = 519;
	public static final int MIPS_INS_SRA = 520;
	public static final int MIPS_INS_SRAI = 521;
	public static final int MIPS_INS_SRARI = 522;
	public static final int MIPS_INS_SRAR = 523;
	public static final int MIPS_INS_SRAV = 524;
	public static final int MIPS_INS_SRL = 525;
	public static final int MIPS_INS_SRLI = 526;
	public static final int MIPS_INS_SRLRI = 527;
	public static final int MIPS_INS_SRLR = 528;
	public static final int MIPS_INS_SRLV = 529;
	public static final int MIPS_INS_SSNOP = 530;
	public static final int MIPS_INS_ST = 531;
	public static final int MIPS_INS_SUBQH = 532;
	public static final int MIPS_INS_SUBQH_R = 533;
	public static final int MIPS_INS_SUBQ = 534;
	public static final int MIPS_INS_SUBQ_S = 535;
	public static final int MIPS_INS_SUBSUS_U = 536;
	public static final int MIPS_INS_SUBSUU_S = 537;
	public static final int MIPS_INS_SUBS_S = 538;
	public static final int MIPS_INS_SUBS_U = 539;
	public static final int MIPS_INS_SUBUH = 540;
	public static final int MIPS_INS_SUBUH_R = 541;
	public static final int MIPS_INS_SUBU = 542;
	public static final int MIPS_INS_SUBU_S = 543;
	public static final int MIPS_INS_SUBVI = 544;
	public static final int MIPS_INS_SUBV = 545;
	public static final int MIPS_INS_SUXC1 = 546;
	public static final int MIPS_INS_SW = 547;
	public static final int MIPS_INS_SWC1 = 548;
	public static final int MIPS_INS_SWC2 = 549;
	public static final int MIPS_INS_SWC3 = 550;
	public static final int MIPS_INS_SWL = 551;
	public static final int MIPS_INS_SWR = 552;
	public static final int MIPS_INS_SWXC1 = 553;
	public static final int MIPS_INS_SYNC = 554;
	public static final int MIPS_INS_SYSCALL = 555;
	public static final int MIPS_INS_TEQ = 556;
	public static final int MIPS_INS_TEQI = 557;
	public static final int MIPS_INS_TGE = 558;
	public static final int MIPS_INS_TGEI = 559;
	public static final int MIPS_INS_TGEIU = 560;
	public static final int MIPS_INS_TGEU = 561;
	public static final int MIPS_INS_TLBP = 562;
	public static final int MIPS_INS_TLBR = 563;
	public static final int MIPS_INS_TLBWI = 564;
	public static final int MIPS_INS_TLBWR = 565;
	public static final int MIPS_INS_TLT = 566;
	public static final int MIPS_INS_TLTI = 567;
	public static final int MIPS_INS_TLTIU = 568;
	public static final int MIPS_INS_TLTU = 569;
	public static final int MIPS_INS_TNE = 570;
	public static final int MIPS_INS_TNEI = 571;
	public static final int MIPS_INS_TRUNC = 572;
	public static final int MIPS_INS_V3MULU = 573;
	public static final int MIPS_INS_VMM0 = 574;
	public static final int MIPS_INS_VMULU = 575;
	public static final int MIPS_INS_VSHF = 576;
	public static final int MIPS_INS_WAIT = 577;
	public static final int MIPS_INS_WRDSP = 578;
	public static final int MIPS_INS_WSBH = 579;
	public static final int MIPS_INS_XOR = 580;
	public static final int MIPS_INS_XORI = 581;

	// some alias instructions
	public static final int MIPS_INS_NOP = 582;
	public static final int MIPS_INS_NEGU = 583;
	public static final int MIPS_INS_MAXIMUM = 584;

	// Group of MIPS instructions

	public static final int MIPS_GRP_INVALID = 0;
	public static final int MIPS_GRP_BITCOUNT = 1;
	public static final int MIPS_GRP_DSP = 2;
	public static final int MIPS_GRP_DSPR2 = 3;
	public static final int MIPS_GRP_FPIDX = 4;
	public static final int MIPS_GRP_MSA = 5;
	public static final int MIPS_GRP_MIPS32R2 = 6;
	public static final int MIPS_GRP_MIPS64 = 7;
	public static final int MIPS_GRP_MIPS64R2 = 8;
	public static final int MIPS_GRP_SEINREG = 9;
	public static final int MIPS_GRP_STDENC = 10;
	public static final int MIPS_GRP_SWAP = 11;
	public static final int MIPS_GRP_MICROMIPS = 12;
	public static final int MIPS_GRP_MIPS16MODE = 13;
	public static final int MIPS_GRP_FP64BIT = 14;
	public static final int MIPS_GRP_NONANSFPMATH = 15;
	public static final int MIPS_GRP_NOTFP64BIT = 16;
	public static final int MIPS_GRP_NOTINMICROMIPS = 17;
	public static final int MIPS_GRP_NOTNACL = 18;
	public static final int MIPS_GRP_NOTMIPS32R6 = 19;
	public static final int MIPS_GRP_NOTMIPS64R6 = 20;
	public static final int MIPS_GRP_CNMIPS = 21;
	public static final int MIPS_GRP_MIPS32 = 22;
	public static final int MIPS_GRP_MIPS32R6 = 23;
	public static final int MIPS_GRP_MIPS64R6 = 24;
	public static final int MIPS_GRP_MIPS2 = 25;
	public static final int MIPS_GRP_MIPS3 = 26;
	public static final int MIPS_GRP_MIPS3_32 = 27;
	public static final int MIPS_GRP_MIPS3_32R2 = 28;
	public static final int MIPS_GRP_MIPS4_32 = 29;
	public static final int MIPS_GRP_MIPS4_32R2 = 30;
	public static final int MIPS_GRP_MIPS5_32R2 = 31;
	public static final int MIPS_GRP_GP32BIT = 32;
	public static final int MIPS_GRP_GP64BIT = 33;
	public static final int MIPS_GRP_JUMP = 34;
	public static final int MIPS_GRP_MAX = 35;
}