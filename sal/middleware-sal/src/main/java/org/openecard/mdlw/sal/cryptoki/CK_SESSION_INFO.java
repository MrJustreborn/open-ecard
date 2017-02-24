package org.openecard.mdlw.sal.cryptoki;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : pkcs11_v2.40/pkcs11t.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CK_SESSION_INFO extends Structure {
	/** C type : CK_SLOT_ID */
	public long slotID;
	public long getSlotID() {
		return slotID;
	}
	public void setSlotID(long slotID) {
		this.slotID = slotID;
	}
	/** C type : CK_STATE */
	public long state;
	public long getState() {
		return state;
	}
	public void setState(long state) {
		this.state = state;
	}
	/**
	 * see below<br>
	 * C type : CK_FLAGS
	 */
	public long flags;
	public long getFlags() {
		return flags;
	}
	public void setFlags(long flags) {
		this.flags = flags;
	}
	/**
	 * device-dependent error code<br>
	 * C type : CK_ULONG
	 */
	public long ulDeviceError;
	public long getUlDeviceError() {
		return ulDeviceError;
	}
	public void setUlDeviceError(long ulDeviceError) {
		this.ulDeviceError = ulDeviceError;
	}
	public CK_SESSION_INFO() {
		super();
	}
	 protected List<String> getFieldOrder() {
		return Arrays.asList("slotID", "state", "flags", "ulDeviceError");
	}
	/**
	 * @param slotID C type : CK_SLOT_ID<br>
	 * @param state C type : CK_STATE<br>
	 * @param flags see below<br>
	 * C type : CK_FLAGS<br>
	 * @param ulDeviceError device-dependent error code<br>
	 * C type : CK_ULONG
	 */
	public CK_SESSION_INFO(long slotID, long state, long flags, long ulDeviceError) {
		super();
		this.slotID = slotID;
		this.state = state;
		this.flags = flags;
		this.ulDeviceError = ulDeviceError;
	}
	public CK_SESSION_INFO(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends CK_SESSION_INFO implements Structure.ByReference {
		
	};
	public static class ByValue extends CK_SESSION_INFO implements Structure.ByValue {
		
	};
}