package com.bbva.mzic.dto.lettercredits;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class LetterCredits implements Serializable  {
	private static final long serialVersionUID = 2931699728946643245L;

	private String letter;
	private String reference;
	private int secuence;
	private List<Banks> banks = new List<Banks>();
	private Costumer costumer = new Costumer();

	public String getLetter() {
		return this.letter;
	}

	public String setLetter(final String letter) {
		this.letter = letter;
	}

	public String getReference() {
		return this.reference;
	}

	public String setReference(final String reference) {
		this.reference = reference;
	}

	public int getSecuence() {
		return this.secuence;
	}

	public int setSecuence(final int secuence) {
		this.secuence = secuence;
	}

	public List<Banks> getBanks() {
		return this.banks;
	}

	public List<Banks> setBanks(final List<Banks> banks) {
		this.banks = banks;
	}

	public Costumer getCostumer() {
		return this.costumer;
	}

	public Costumer setCostumer(final Costumer costumer) {
		this.costumer = costumer;
	}

	
	@Override
	public boolean equals(final Object obj) {
		if (obj == null) { return false; }
		if (obj == this) { return true; }
		if (obj.getClass() != getClass()) {
			return false;
		}
		final LetterCredits rhs = (LetterCredits) obj;
		return new EqualsBuilder().appendSuper(super.equals(obj))
					.append(letter, rhs.letter)
					.append(reference, rhs.reference)
					.append(secuence, rhs.secuence)
					.append(banks, rhs.banks)
					.append(costumer, rhs.costumer)
					.isEquals();
	}

	
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.letter)
			.append(this.reference)
			.append(this.secuence)
			.append(this.banks)
			.append(this.costumer)
			.toHashCode();
	}

	
	@Override
	public String toString() {
		return new ToStringBuilder(this)
			.append("letter", letter)
			.append("reference", reference)
			.append("secuence", secuence)
			.append("banks", banks)
			.append("costumer", costumer)
			.toString();
	}
}
