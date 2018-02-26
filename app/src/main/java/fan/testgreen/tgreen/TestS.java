package fan.testgreen.tgreen;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Superfan on 2018/2/26.
 * 描述：
 */
@Entity(nameInDb = "test")
public class TestS {
    @Property
    private String ts;

    @Generated(hash = 672567680)
    public TestS(String ts) {
        this.ts = ts;
    }

    @Generated(hash = 1479627824)
    public TestS() {
    }

    public String getTs() {
        return this.ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }


}
