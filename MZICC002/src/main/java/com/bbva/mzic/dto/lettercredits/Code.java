import com.bbva.mzic.dto.lettercredits.LetterCredits;

public class Code {

    private int id;

    public int getId() {
        return this.id;
    }

    public int setId(final int id) {
        this.id = id;
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
					.append(id, rhs.id)
					.isEquals();
	}

	
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.id)
			.toHashCode();
	}

	
	@Override
	public String toString() {
		return new ToStringBuilder(this)
			.append("id", id)
			.toString();
	}
    
}
