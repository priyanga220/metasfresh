/** Generated Model - DO NOT CHANGE */
package de.metas.handlingunits.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Properties;

/** Generated Model for M_Picking_Candidate
 *  @author Adempiere (generated) 
 */
@SuppressWarnings("javadoc")
public class X_M_Picking_Candidate extends org.compiere.model.PO implements I_M_Picking_Candidate, org.compiere.model.I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 258210568L;

    /** Standard Constructor */
    public X_M_Picking_Candidate (Properties ctx, int M_Picking_Candidate_ID, String trxName)
    {
      super (ctx, M_Picking_Candidate_ID, trxName);
      /** if (M_Picking_Candidate_ID == 0)
        {
			setM_Picking_Candidate_ID (0);
			setM_PickingSlot_ID (0);
			setM_ShipmentSchedule_ID (0);
			setQtyPicked (BigDecimal.ZERO); // 0
        } */
    }

    /** Load Constructor */
    public X_M_Picking_Candidate (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }


    /** Load Meta Data */
    @Override
    protected org.compiere.model.POInfo initPO (Properties ctx)
    {
      org.compiere.model.POInfo poi = org.compiere.model.POInfo.getPOInfo (ctx, Table_Name, get_TrxName());
      return poi;
    }

	@Override
	public org.compiere.model.I_C_UOM getC_UOM() throws RuntimeException
	{
		return get_ValueAsPO(COLUMNNAME_C_UOM_ID, org.compiere.model.I_C_UOM.class);
	}

	@Override
	public void setC_UOM(org.compiere.model.I_C_UOM C_UOM)
	{
		set_ValueFromPO(COLUMNNAME_C_UOM_ID, org.compiere.model.I_C_UOM.class, C_UOM);
	}

	/** Set Maßeinheit.
		@param C_UOM_ID 
		Maßeinheit
	  */
	@Override
	public void setC_UOM_ID (int C_UOM_ID)
	{
		if (C_UOM_ID < 1) 
			set_Value (COLUMNNAME_C_UOM_ID, null);
		else 
			set_Value (COLUMNNAME_C_UOM_ID, Integer.valueOf(C_UOM_ID));
	}

	/** Get Maßeinheit.
		@return Maßeinheit
	  */
	@Override
	public int getC_UOM_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_UOM_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	@Override
	public de.metas.handlingunits.model.I_M_HU getM_HU() throws RuntimeException
	{
		return get_ValueAsPO(COLUMNNAME_M_HU_ID, de.metas.handlingunits.model.I_M_HU.class);
	}

	@Override
	public void setM_HU(de.metas.handlingunits.model.I_M_HU M_HU)
	{
		set_ValueFromPO(COLUMNNAME_M_HU_ID, de.metas.handlingunits.model.I_M_HU.class, M_HU);
	}

	/** Set Handling Units.
		@param M_HU_ID Handling Units	  */
	@Override
	public void setM_HU_ID (int M_HU_ID)
	{
		if (M_HU_ID < 1) 
			set_Value (COLUMNNAME_M_HU_ID, null);
		else 
			set_Value (COLUMNNAME_M_HU_ID, Integer.valueOf(M_HU_ID));
	}

	/** Get Handling Units.
		@return Handling Units	  */
	@Override
	public int getM_HU_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_HU_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Picking candidate.
		@param M_Picking_Candidate_ID Picking candidate	  */
	@Override
	public void setM_Picking_Candidate_ID (int M_Picking_Candidate_ID)
	{
		if (M_Picking_Candidate_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_M_Picking_Candidate_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_M_Picking_Candidate_ID, Integer.valueOf(M_Picking_Candidate_ID));
	}

	/** Get Picking candidate.
		@return Picking candidate	  */
	@Override
	public int getM_Picking_Candidate_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Picking_Candidate_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	@Override
	public de.metas.picking.model.I_M_PickingSlot getM_PickingSlot() throws RuntimeException
	{
		return get_ValueAsPO(COLUMNNAME_M_PickingSlot_ID, de.metas.picking.model.I_M_PickingSlot.class);
	}

	@Override
	public void setM_PickingSlot(de.metas.picking.model.I_M_PickingSlot M_PickingSlot)
	{
		set_ValueFromPO(COLUMNNAME_M_PickingSlot_ID, de.metas.picking.model.I_M_PickingSlot.class, M_PickingSlot);
	}

	/** Set Picking Slot.
		@param M_PickingSlot_ID Picking Slot	  */
	@Override
	public void setM_PickingSlot_ID (int M_PickingSlot_ID)
	{
		if (M_PickingSlot_ID < 1) 
			set_Value (COLUMNNAME_M_PickingSlot_ID, null);
		else 
			set_Value (COLUMNNAME_M_PickingSlot_ID, Integer.valueOf(M_PickingSlot_ID));
	}

	/** Get Picking Slot.
		@return Picking Slot	  */
	@Override
	public int getM_PickingSlot_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_PickingSlot_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	@Override
	public de.metas.inoutcandidate.model.I_M_ShipmentSchedule getM_ShipmentSchedule() throws RuntimeException
	{
		return get_ValueAsPO(COLUMNNAME_M_ShipmentSchedule_ID, de.metas.inoutcandidate.model.I_M_ShipmentSchedule.class);
	}

	@Override
	public void setM_ShipmentSchedule(de.metas.inoutcandidate.model.I_M_ShipmentSchedule M_ShipmentSchedule)
	{
		set_ValueFromPO(COLUMNNAME_M_ShipmentSchedule_ID, de.metas.inoutcandidate.model.I_M_ShipmentSchedule.class, M_ShipmentSchedule);
	}

	/** Set Lieferdisposition.
		@param M_ShipmentSchedule_ID Lieferdisposition	  */
	@Override
	public void setM_ShipmentSchedule_ID (int M_ShipmentSchedule_ID)
	{
		if (M_ShipmentSchedule_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_M_ShipmentSchedule_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_M_ShipmentSchedule_ID, Integer.valueOf(M_ShipmentSchedule_ID));
	}

	/** Get Lieferdisposition.
		@return Lieferdisposition	  */
	@Override
	public int getM_ShipmentSchedule_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_ShipmentSchedule_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Verarbeitet.
		@param Processed 
		Checkbox sagt aus, ob der Beleg verarbeitet wurde. 
	  */
	@Override
	public void setProcessed (boolean Processed)
	{
		set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
	}

	/** Get Verarbeitet.
		@return Checkbox sagt aus, ob der Beleg verarbeitet wurde. 
	  */
	@Override
	public boolean isProcessed () 
	{
		Object oo = get_Value(COLUMNNAME_Processed);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Qty Picked.
		@param QtyPicked Qty Picked	  */
	@Override
	public void setQtyPicked (java.math.BigDecimal QtyPicked)
	{
		set_Value (COLUMNNAME_QtyPicked, QtyPicked);
	}

	/** Get Qty Picked.
		@return Qty Picked	  */
	@Override
	public java.math.BigDecimal getQtyPicked () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyPicked);
		if (bd == null)
			 return BigDecimal.ZERO;
		return bd;
	}
}