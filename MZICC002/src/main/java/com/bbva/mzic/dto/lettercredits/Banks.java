import com.bbva.mzic.dto.lettercredits.LetterCredits;

public class Banks {

    private int id;
    private String name;
    private String address;
    private List<Code> code = new List<Code>();

    public int getId() {
        return this.id;
    }

    public int setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public String setName(final String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.addres;
    }

    public String setAddress(final String address) {
        this.address = address;
    }

    public List<Code> getCode() {
        return this.code;
    }

    public List<Code> setCode(final List<Code> code) {
        this.code = code;
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
					.append(name, rhs.name)
					.append(address, rhs.address)
					.append(code, rhs.code)
					.isEquals();
	}

	
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.id)
			.append(this.name)
			.append(this.address)
			.append(this.code)
			.toHashCode();
	}

	
	@Override
	public String toString() {
		return new ToStringBuilder(this)
			.append("id", id)
			.append("name", name)
			.append("address", address)
			.append("code", code)
			.toString();
	}

}
