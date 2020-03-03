package examples.gadgets.ECDL;

import java.math.BigInteger;

public class Constants {
    //parameters
    //secret bit width of the scalar for scalar multiplication of a point on EC
    public final static int SECRET_BITWIDTH = 253;
    //bit width of the BigInteger secrets given into the commitment
    public final static int COMMITMENT_SECRET_LENGTH = 256;

    //gadget descriptions
    public static final String DESC_SCALAR_MULT_POINT_OVER_EC = "Scalar_Mult_point_Over_EC";
    public static final String DESC_SCALR_MULT_TWO_POINTS_OVER_EC = "Scalar_Mult_Two_Points_Over_EC";
    public static final String DESC_ADD_TWO_POINTS_OVER_EC = "Add_Two_Points_Over_EC";
    public static final String DESC_ENCODE_ONE = "Encode_One_With_EC_Elgamal_Exponent";
    public static final String DESC_ADD_TWO_ENC = "Add_Two_Encodings";
    public static final String DESC_UPDATE_ZEROTH_ENCODED_COEFFICIENT = "Update zeroth encoded coefficient";
    public static final String DESC_COMMITMENT_SHA_256 = "Commitment_SHA256";

    //output wire descriptions
    public static final String DESC_OP_COMMITMENT = "Output_Commitment";
    public static final String DESC_OP_FRESH_ENC_ONE = "Output_Fresh_Encoding_One";

    //samples values for the x-coordinate of the base point, x-coordinate of the public key and secret scalar value, taken from
    //ECDHKeyExchange_Test.java
    public static BigInteger BASE_X = new BigInteger("4");
    public static BigInteger PUBLIC_KEY_X = new BigInteger("21766081959050939664800904742925354518084319102596785077490863571049214729748");

    public static BigInteger K = new BigInteger("13867691842196510828352345865165018381161315605899394650350519162543016860992");
    public static BigInteger a = new BigInteger("13867691842196510828352345865165018381161315605899394650350519162543016860990");
}
