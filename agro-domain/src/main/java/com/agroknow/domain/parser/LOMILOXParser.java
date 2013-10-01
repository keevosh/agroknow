/* The following code was generated by JFlex 1.4.3 on 30/9/2013 5:42 �� */

package com.agroknow.domain.parser;

import java.util.HashSet;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 30/9/2013 5:42 �� from the specification file
 * <tt>c:/workspace-sts/agroknow/agro-domain/src/main/jflex/lomiloxParser.jflex</tt>
 */
class LOMILOXParser {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int ITEM = 8;
  public static final int YYINITIAL = 0;
  public static final int IDENTIFIER = 6;
  public static final int HEADER = 4;
  public static final int ILOX = 2;
  public static final int LOCATION = 10;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5, 5
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\12\0\1\24\44\0\1\25\14\0\1\1\1\0\1\17\42\0\1\21"+
    "\1\0\1\15\1\7\1\10\1\13\1\23\1\0\1\6\1\0\1\5"+
    "\1\22\1\20\1\11\1\3\1\16\1\0\1\4\1\14\1\12\1\27"+
    "\1\0\1\2\1\0\1\26\uff86\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\6\0\7\1\41\0\1\2\12\0\1\3\17\0\1\4"+
    "\27\0\1\5\1\0\1\6\10\0\1\7\2\0\1\10"+
    "\4\0\1\11\4\0\1\11";

  private static int [] zzUnpackAction() {
    int [] result = new int[122];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\30\0\60\0\110\0\140\0\170\0\220\0\250"+
    "\0\300\0\330\0\360\0\u0108\0\u0120\0\u0138\0\u0150\0\u0168"+
    "\0\u0180\0\u0198\0\u01b0\0\u01c8\0\u01e0\0\u01f8\0\u0210\0\u0228"+
    "\0\u0240\0\u0258\0\u0270\0\u0288\0\u02a0\0\u02b8\0\u02d0\0\u02e8"+
    "\0\u0300\0\u0318\0\u0330\0\u0348\0\u0360\0\u0378\0\u0390\0\u03a8"+
    "\0\u03c0\0\u03d8\0\u03f0\0\u0408\0\u0420\0\u0438\0\220\0\u0450"+
    "\0\u0468\0\u0480\0\u0498\0\u04b0\0\u04c8\0\u04e0\0\u04f8\0\u0510"+
    "\0\u0528\0\220\0\u0540\0\u0558\0\u0570\0\u0588\0\u05a0\0\u05b8"+
    "\0\u05d0\0\u05e8\0\u0600\0\u0618\0\u0630\0\u0648\0\u0660\0\u0678"+
    "\0\u0690\0\220\0\u06a8\0\u06c0\0\u06d8\0\u06f0\0\u0708\0\u0720"+
    "\0\u0738\0\u0750\0\u0768\0\u0780\0\u0798\0\u07b0\0\u07c8\0\u07e0"+
    "\0\u07f8\0\u0810\0\u0828\0\u0840\0\u0858\0\u0870\0\u0888\0\u08a0"+
    "\0\u08b8\0\220\0\u08d0\0\220\0\u08e8\0\u0900\0\u0918\0\u0930"+
    "\0\u0948\0\u0960\0\u0978\0\u0990\0\u0600\0\u09a8\0\u09c0\0\220"+
    "\0\u09d8\0\u09f0\0\u0a08\0\u0a20\0\u0708\0\u0a38\0\u0a50\0\u0a68"+
    "\0\u0a80\0\u08a0";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[122];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\7\1\10\27\7\1\11\27\7\1\12\27\7\1\13"+
    "\27\7\1\14\27\7\1\15\26\7\32\0\1\16\27\0"+
    "\1\16\3\0\1\17\23\0\1\16\3\0\1\20\1\21"+
    "\22\0\1\16\5\0\1\22\4\0\1\23\7\0\1\24"+
    "\4\0\1\16\17\0\1\25\2\0\1\26\4\0\1\16"+
    "\22\0\1\27\1\0\1\30\3\0\1\31\36\0\1\32"+
    "\24\0\1\33\30\0\1\34\30\0\1\35\37\0\1\36"+
    "\14\0\1\37\24\0\1\40\32\0\1\41\43\0\1\42"+
    "\11\0\1\43\27\0\1\44\33\0\1\45\27\0\1\46"+
    "\33\0\1\47\25\0\1\50\27\0\1\51\24\0\1\52"+
    "\35\0\1\53\24\0\1\54\20\0\1\55\32\0\1\56"+
    "\26\0\1\57\42\0\1\60\20\0\1\61\33\0\1\62"+
    "\16\0\1\63\44\0\1\64\16\0\1\65\40\0\1\66"+
    "\16\0\1\67\34\0\1\70\31\0\1\71\27\0\1\72"+
    "\22\0\1\73\21\0\1\74\51\0\1\75\23\0\1\76"+
    "\16\0\1\77\30\0\1\100\35\0\1\101\30\0\1\102"+
    "\6\0\24\103\1\0\3\103\6\0\1\104\27\0\1\105"+
    "\40\0\1\106\13\0\1\107\36\0\1\110\23\0\1\111"+
    "\40\0\1\112\22\0\1\113\15\0\1\103\1\114\22\103"+
    "\1\0\3\103\13\0\1\115\32\0\1\116\11\0\24\117"+
    "\1\0\3\117\23\0\1\120\12\0\1\121\24\0\1\122"+
    "\32\0\1\123\21\0\1\103\1\114\22\103\1\0\1\124"+
    "\2\103\6\0\1\125\33\0\1\126\15\0\1\117\1\127"+
    "\22\117\1\0\3\117\17\0\1\130\23\0\1\131\25\0"+
    "\1\132\21\0\1\133\24\0\1\103\1\114\22\103\1\0"+
    "\2\103\1\134\10\0\1\135\25\0\1\136\21\0\1\117"+
    "\1\127\22\117\1\0\1\137\2\117\24\140\1\0\3\140"+
    "\6\0\1\141\40\0\1\142\21\0\1\60\16\0\1\103"+
    "\1\114\2\103\1\143\17\103\1\0\3\103\4\0\1\144"+
    "\26\0\1\145\24\0\1\117\1\127\6\117\1\146\13\117"+
    "\1\0\3\117\1\140\1\147\22\140\1\0\3\140\10\0"+
    "\1\150\17\0\1\103\1\114\4\103\1\151\15\103\1\0"+
    "\3\103\11\0\1\101\16\0\1\117\1\127\7\117\1\152"+
    "\12\117\1\0\3\117\1\140\1\147\22\140\1\0\1\153"+
    "\2\140\4\0\1\154\23\0\1\103\1\114\15\103\1\155"+
    "\4\103\1\0\3\103\1\117\1\127\10\117\1\156\11\117"+
    "\1\0\3\117\1\140\1\147\13\140\1\157\6\140\1\0"+
    "\3\140\17\0\1\160\10\0\1\117\1\127\2\117\1\161"+
    "\17\117\1\0\3\117\1\140\1\147\17\140\1\162\2\140"+
    "\1\0\3\140\1\117\1\127\22\117\1\0\1\117\1\163"+
    "\1\117\1\140\1\147\10\140\1\164\11\140\1\0\3\140"+
    "\1\117\1\127\15\117\1\165\4\117\1\0\3\117\1\140"+
    "\1\147\17\140\1\166\2\140\1\0\4\140\1\147\20\140"+
    "\1\167\1\140\1\0\4\140\1\147\1\140\1\170\20\140"+
    "\1\0\4\140\1\147\21\140\1\171\1\0\4\140\1\147"+
    "\15\140\1\172\4\140\1\0\3\140";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2712];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\6\0\1\11\6\1\41\0\1\11\12\0\1\11\17\0"+
    "\1\11\27\0\1\11\1\0\1\11\10\0\1\1\2\0"+
    "\1\11\4\0\1\1\4\0\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[122];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
	////////////////////////////////////////////////////////////////////////////////
	// CONSTANTS
	////////////////////////////////////////////////////////////////////////////////

	////////////////////////////////////////////////////////////////////////////////
	// VARIABLES
	////////////////////////////////////////////////////////////////////////////////
	
	private HashSet<String> locations ;
	private HashSet<String> identifiers ;
	private StringBuilder tmp ;

	
	 	
 	////////////////////////////////////////////////////////////////////////////////
	// SETTERS AND GETTERS
	////////////////////////////////////////////////////////////////////////////////
  	
  	public HashSet<String> getLocations()
  	{
  		return locations ;
  	}

  	public HashSet<String> getIdentifiers()
  	{
  		return identifiers ;
  	}
	
	////////////////////////////////////////////////////////////////////////////////
	// UTILITY METHODS
	////////////////////////////////////////////////////////////////////////////////


	private String extract( String element )
	{	
		return element.substring(element.indexOf(">") + 1 , element.indexOf("</") );
	}


                                           


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LOMILOXParser(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  LOMILOXParser(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 70) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 4: 
          { yybegin( ILOX ) ;
          }
        case 10: break;
        case 6: 
          { yybegin( IDENTIFIER ) ;
		tmp = new StringBuilder() ;
          }
        case 11: break;
        case 5: 
          { yybegin( LOCATION );
          }
        case 12: break;
        case 2: 
          { yybegin(HEADER) ;
		locations = new HashSet<String>() ;
		identifiers = new HashSet<String>() ;
          }
        case 13: break;
        case 9: 
          { tmp.append( extract( yytext() ).trim() ) ;
          }
        case 14: break;
        case 7: 
          { locations.add( extract( yytext() ).trim() ) ;
          }
        case 15: break;
        case 8: 
          { identifiers.add( tmp.toString() ) ;
		yybegin( HEADER ) ;
          }
        case 16: break;
        case 3: 
          { yybegin( ITEM ) ;
          }
        case 17: break;
        case 1: 
          { 
          }
        case 18: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return YYEOF;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java LOMILOXParser <inputfile>");
    }
    else {
      for (int i = 0; i < argv.length; i++) {
        LOMILOXParser scanner = null;
        try {
          scanner = new LOMILOXParser( new java.io.FileReader(argv[i]) );
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
