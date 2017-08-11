import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public class Inline {

    /*

    @Metadata(
            mv = {1, 1, 6},
            bv = {1, 0, 1},
            k = 2,
            d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0019\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005\u001a\u0017\u0010\u0006\u001a\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0086\b¨\u0006\t"},
            d2 = {"main", "", "args", "", "", "([Ljava/lang/String;)V", "operation", "op", "Lkotlin/Function0;", "production sources for module kotlindemo_main"}
    )
    public final class InlineFunctionsKt {
        public static final void operation(@NotNull Function0 op) {
            Intrinsics.checkParameterIsNotNull(op, "op");
            String var2 = "Before calling op";
            System.out.println(var2);
            op.invoke();
            var2 = "After calling op";
            System.out.println(var2);
        }

        public static final void main(@NotNull String[] args) {
            Intrinsics.checkParameterIsNotNull(args, "args");
            String var1 = "Before calling op";
            System.out.println(var1);
            String var2 = "This is the actiual function";
            System.out.println(var2);
            var1 = "After calling op";
            System.out.println(var1);
        }
    }

    */
}
